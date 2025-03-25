package org.example.designpatterns.behavioural.chainofresponsibility;

import java.util.Objects;

public abstract class Logger {
    private final Logger nextLogger;

    protected Logger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void handleRequest(){
        if (!process() || !Objects.isNull(nextLogger)){
            nextLogger.handleRequest();
        }
        System.out.println("Request Completed!");
    }

    abstract boolean process();
}
