package com.pb.nesterenko.hw9;


import java.io.File;

public class FileNumbers {
    public static void main(String [] argjs)
    void createNumbersFile() {

        try (Writer writer = new FileWriter(fileName:"F://java/numbers.txt") {
            int[][] array = new int[10][10];
            for (int i = 0; i < array.length; i++,System.out.println()){
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = ((int)(Math.random() * 99 * 1));
                    System.out.println(array[i][j] + ' ');
                    writer.newLine();
                    writer.write(array[i][j] + ' ');

                }

            }


        } catch (Exception e) {
          System.out.println("Помилка з вайлом:" + e);
        }
    }
    public void createOddNumbersFile() {
        try (Scanner in = new Scanner(new File("numbers.txt"))) {
            PrintWriter pw = new PrintWriter(new File("odd-numbers.txt"));
            System.out.println("Введення чисел , з урахуванням замыни цылих чисел на '0':");
            while (in.hasNextLine()) {
                Scanner line = new Scanner(in.nextLine());
                while (line.hasNextInt()) {
                    int ch = line.nextInt();
                    if (ch % 2 == 0) {
                        System.out.println("0");
                        ch = 0;
                    } else
                        System.out.println(ch + " ");
                    pw.println(ch + " ");
                }
                line.close();
                pw.println();

            }
            System.out.println();
        } catch (IOException ioException) {
            System.out.println("файл не записаний" + ioException);
        }
    }
    public static void main(String[] args) {
        Path path = Paths.get("files/s01-input-text.txt");

        try (Scanner scan = new Scanner(path)) {


            while (true) {
                String str = scan.nextLine();
                System.out.println(str);
            }

        } catch (NoSuchElementException ex) {
            System.out.println("Файл прочитанйф");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }