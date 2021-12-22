package com.pb.nesterenko.hw12;

import java.time.LocalDate;

public class Person {
    private String fullname;
    private String phone;
    private LocalDate dateOfBirth;
    private String adress;
    private LocalDate dateAndTimeEdit;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public LocalDate getDateAndTimeEdit() {
        return dateAndTimeEdit;
    }

    public void setDateAndTimeEdit(LocalDate dateAndTimeEdit) {
        this.dateAndTimeEdit = dateAndTimeEdit;
    }

    public Person(String fullname, LocalDate dateOfBirth, String phone, String adress, LocalDate dateAndTimeEdit) {
        this.fullname = fullname;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.adress = adress;
        this.dateAndTimeEdit = dateAndTimeEdit;


    }
