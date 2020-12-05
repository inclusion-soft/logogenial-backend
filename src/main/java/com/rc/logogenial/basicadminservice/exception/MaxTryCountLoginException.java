package com.rc.logogenial.basicadminservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN)
public class MaxTryCountLoginException extends RuntimeException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new unauthorized request exception.
     */
    public MaxTryCountLoginException() {
        super();
    }

    /**
     * Instantiates a new unauthorized request exception.
     *
     * @param message the message
     * @param cause the cause
     */
    public MaxTryCountLoginException(final String message, final Throwable cause) {
        super(message, cause);
    }



    /**
     * Instantiates a new unauthorized request exception.
     *
     * @param message the message
     */
    public MaxTryCountLoginException(final String message) {
        super(message);
    }

    /**
     * Instantiates a new unauthorized request exception.
     *
     * @param cause the cause
     */
    public MaxTryCountLoginException(final Throwable cause) {
        super(cause);
    }

}
