package com.prime.number.test.application.exceptions;

public class InvalidValueTypeException extends Exception {

    public InvalidValueTypeException() {
    }

    public InvalidValueTypeException(String message) {
        super(message);
    }

    public InvalidValueTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidValueTypeException(Throwable cause) {
        super(cause);
    }

    public InvalidValueTypeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
