package org.example.designpatterns.behavioural.chainofresponsibility;

public class InfoLogger extends Logger{
    protected InfoLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    boolean process() {
        return false;
    }
}
