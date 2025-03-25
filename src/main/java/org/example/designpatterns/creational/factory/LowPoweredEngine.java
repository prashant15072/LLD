package org.example.designpatterns.creational.factory;

public class LowPoweredEngine implements Engine{
    @Override
    public void buildEngine() {
        System.out.println("Build Low powered engine!");
    }
}
