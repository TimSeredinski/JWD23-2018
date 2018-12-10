package com.epam.seredinski.triangle.exception;

public class ReadFromFileException extends ApplicationException{

    public ReadFromFileException() {
        super();
    }

    public ReadFromFileException(String message) {
        super(message);
    }

    public ReadFromFileException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReadFromFileException(Throwable cause) {
        super(cause);
    }

}
