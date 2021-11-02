package com.pb.nesterenko.hw5;

public class Library {


    public static void main(String[] arg) {
        Book book1 = new Book(nameBook: 'Енергетичний менеджмент', athorBook: 'О.М. Савінов', yearPublishing: '2008');
        Book book2 = new Book(nameBook: 'Енергетичний бізнес', athorBook: 'Л.Д. Гительман', yearPublishing: '2006'  );
        Book book3 = new Book(nameBook: 'Енергезбереження', athorBook: 'Н.Ф. Ільїнський ', yearPublishing: '1989'');

            Book[] books ={book1, book2, book3};

        for(Book x : books){
            System.out.println(x.toString());

        }

        Reader reader1 = new Reader(fullName: 'Іванов С.С.', libraryCardNumber: '73', faculty: 'економіка', dateBirth: '30.12.1988', phoneNumber: '0965896325');
        Reader reader2 = new Reader(fullName: 'Приходько К.С.', libraryCardNumber: '63', faculty: 'економіка', dateBirth: '11.10.1988', phoneNumber: '0965896327');
        Reader reader3 = new Reader(fullName: 'Борсук М.С.', libraryCardNumber: '88', faculty: 'економіка', dateBirth: '16.08.1988', phoneNumber: '0965896328');

        Reader[] readers = {reader1, reader2, reader3};

        for(Reader reader : readers){
            System.out.println(reader.toString());
        }



