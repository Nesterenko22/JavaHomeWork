package com.pb.nesterenko.hw10;

public class IndexException extends Throwable {
    private int index;

    public IndexException(String msg) {
        super(msg);
    }

}
