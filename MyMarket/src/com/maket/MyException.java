package com.maket;

public class MyException extends Exception {
    private static final long serialVersionUID = 1L;
    public MyException() {
        super();
    }

    public MyException(String pwd) {
        super("密码长度不得小于6");
    }
}
