package org.example.distributedcaching.exception;

import lombok.Getter;

@Getter
public class InternalServerError extends RuntimeException{
    private final String message;

    public InternalServerError(String message) {
        super();
        this.message = message;
    }
}
