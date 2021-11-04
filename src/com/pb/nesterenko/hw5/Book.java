package com.pb.nesterenko.hw5;

public class Book {
    private String nameBook;
    private String athorBook;
    private int yearPublishing;

    public String getNameBook(){
        return nameBook;
    }

    public void setNameBook(String nameBook){
        this.nameBook = nameBook;
    }

    public String getAthorBook() {
        return athorBook;
    }

    public void setAthorBook(String athorBook) {
        this.athorBook = athorBook;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public Book(String nameBook, String athorBook, int yearPublishing){
        this.nameBook = nameBook;
        this.athorBook = athorBook;
        this.yearPublishing = yearPublishing;
    }

}
