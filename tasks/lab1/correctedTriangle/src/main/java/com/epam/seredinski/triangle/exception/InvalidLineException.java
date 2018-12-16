package com.epam.seredinski.triangle.exception;

public class InvalidLineException extends ApplicationException {

    public InvalidLineException() {
        super();
    }

    public InvalidLineException(String message) {
        super(message);
    }

    public InvalidLineException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidLineException(Throwable cause) {
        super(cause);
    }

}
