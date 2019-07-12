package com.egoist.gzeport.common.exception;

/**
 * 异常类
 */
public class MyException extends Exception {

    /**
     * @param message
     * @param cause
     */
    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param message
     */
    public MyException(String message) {
        super(message);
    }

    /**
     * @param cause
     */
    public MyException(Throwable cause) {
        super(cause);
    }
}
