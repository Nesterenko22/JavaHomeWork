package com.pb.nesterenko.hw14;

import javax.jnlp.FileContents;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalTime;

public class EchoServer {

    public static void main(String[] args) throws Exception {
        int port = 1234;
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("Сервер запущен на порту : " + port);



        @Override
        public void run() {
            try {
                System.out.println(Thread.currentThread().getName() + ": Получен запрос от клиента");

                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));


                String headerLine;
                while((headerLine = in.readLine()).length() != 0){
                    System.out.println(headerLine);
                }


                StringBuilder payload = new StringBuilder();
                while(in.ready()){
                    payload.append((char) in.read());
                }
                System.out.println("\nТело запроса: " + payload);


                int sec = 10;
                System.out.println("Ждем " + sec + " секунд имитируя долгу обработку");
                Thread.sleep(sec * 1000);


            out.write("HTTP/1.0 200 OK\r\n");
            out.write("Content-Type: text/html; charset=utf-8\r\n");
            out.write("\r\n");
            out.write("<html><body><h1>");
            out.write("Ответ от сервера, текущая дата: ");
            out.write(LocalTime.now().toString());
            out.write("</h1></body></html>");

            System.out.println("Закрываем соединение с клиентом");
            out.close();
            in.close();
            clientSocket.close();
        }
    }
}
}
