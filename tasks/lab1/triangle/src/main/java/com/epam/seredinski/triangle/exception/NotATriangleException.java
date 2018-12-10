package com.epam.seredinski.triangle.exception;

public class NotATriangleException extends ApplicationException {

    public NotATriangleException() {
        super();
    }

    public NotATriangleException(String message) {
        super(message);
    }

    public NotATriangleException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotATriangleException(Throwable cause) {
        super(cause);
    }

}
