package com.pb.nesterenko.hw8;

public class WrongPasswordException extends Exception {


    private String password;

    public WrongPasswordException(msg) {
        super.(msg);
    }

    public WrongPasswordException (String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
}
