package com.smmot.suamo.core.exceptions;

/**
 * Created by adams on 2017/4/11.
 */
public class RuntimeOtherException extends RuntimeException{
    public RuntimeOtherException() {
        super();
    }

    public RuntimeOtherException(String message, Throwable cause) {
        super(message, cause);
    }

    public RuntimeOtherException(String message) {
        super(message);
    }

    public RuntimeOtherException(Throwable cause) {
        super(cause);
    }
}