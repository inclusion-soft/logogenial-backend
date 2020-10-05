package com.rc.logogenial.basicadminservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT)
public class ErrorPersistException extends RuntimeException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new unauthorized request exception.
     */
    public ErrorPersistException() {
        super();
    }

    /**
     * Instantiates a new unauthorized request exception.
     *
     * @param message the message
     * @param cause the cause
     */
    public ErrorPersistException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new unauthorized request exception.
     *
     * @param message the message
     */
    public ErrorPersistException(final String message) {
        super(message);
    }

    /**
     * Instantiates a new unauthorized request exception.
     *
     * @param cause the cause
     */
    public ErrorPersistException(final Throwable cause) {
        super(cause);
    }

}
