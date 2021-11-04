package com.pb.nesterenko.hw5;

public class Reader {
   public String fullName;
   public int libraryCardName;
   public int faculty;
   public int dateBirth;
   public int phoneNumber;

    public Reader(String fullName, int libraryCardName, int faculty, int dateBirth, int dateBirth, int phoneNumber){
        this.fullName = fullName;
        this.libraryCardName = libraryCardName;
        this.faculty = faculty;
        this.dateBirth = dateBirth;
        this.phoneNumber = phoneNumber;

    }
    public void takeBook(String fullName,String name){
        System.out.println(fullName + 'Взяв книгу' + name);
    }
    public void returnBook(String fullName, String name, String athorBook, String date ){
        System.out.println(fullName + "повернув книгу" + name + athorBook + date);
    }
    public void takeBook(int faculty,int phoneNumber, int dateBirth, int libraryCardName){
        System.out.println(faculty + 'взяв книгу' + phoneNumber + dateBirth + libraryCardName);
    }
    public void returnBook(String fullName, int libraryCardName, String nameBook){
        System.out.println(fullName + 'повернув книгу' + nameBook + libraryCardName);
    }
}
