package com.pb.nesterenko.hw13;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.Lock;

public class ClientBankLock<T> {
    static class Client implements Runnable {

        private final Lock buyLock;
        private final int BUFFER_MAX_SIZE = 5;
        private List<T> buffer = new LinkedList<>();
        synchronized void give(T value) throws InterruptedException {
            while (buffer.size() == BUFFER_MAX_SIZE) {
                wait();
            }
            buffer.add(value);
            notify();
        }

        synchronized T buy() throws InterruptedException {
            while (buffer.size() == 0) {
                wait();
            }
            T result = buffer.remove(0);
            notify();
            return result;
        }


        public Client(Lock buyLock, StringBuffer buffer) {
            this.buyLock = buyLock;
        }

        public void run() {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " try buy lock");
            buyLock.lock();
            System.out.println(threadName + " buy lock");
            try {
                int seconds = new Random().nextInt(5);
                System.out.println(threadName + " buy time: " + seconds + " seconds.");
                Thread.sleep(seconds * 1000);
                System.out.println(threadName + " buy message: " + buffer.toString());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                buyLock.unlock();
                System.out.println(threadName + " buy unlock");
            }
        }
    }

    static class Bank implements Runnable {

        private final Lock giveLock;
        private final String str;
        private final int BUFFER_MAX_SIZE = 5;
        private List<T> buffer = new LinkedList<>();
        synchronized void give(T value) throws InterruptedException {
            while (buffer.size() == BUFFER_MAX_SIZE) {
                wait();
            }
            buffer.add(value);
            notify();
        }

        synchronized T buy() throws InterruptedException {
            while (buffer.size() == 0) {
                wait();
            }
            T result = buffer.remove(0);
            notify();
            return result;
        }

        public Bank(Lock giveLock, StringBuffer buffer, String str) {
            this.giveLock = giveLock;
            this.str = str;
        }

        public void run() {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " try give lock");
            giveLock.lock();
            System.out.println(threadName + " give lock");
            try {
                int seconds = new Random().nextInt(5);
                System.out.println(threadName + " give time " + seconds + " seconds.");
                Thread.sleep(seconds * 1000);
                buffer.append(str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                giveLock.unlock();
                System.out.println(threadName + " give unlock");
            }
        }
    }

    public static void main(String[] strings) {
        LinkedList<Double> sharedQueue = new LinkedList<>();
        int size = 5;
        Thread prodThread = new Thread(new Bank(sharedQueue, size), "give");
        Thread consThread = new Thread(new Client(sharedQueue), "buy");
        prodThread.start();
        consThread.start();
    }
    }
}
}
