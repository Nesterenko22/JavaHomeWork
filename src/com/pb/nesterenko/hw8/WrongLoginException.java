package com.pb.nesterenko.hw8;

public class WrongLoginException extends Exception {

    private int login;

    public WrongLoginException(String msg) {
        super(msg);
    }

    public WrongLoginException (int login) {
        this.login = login;
    }

    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }
}
