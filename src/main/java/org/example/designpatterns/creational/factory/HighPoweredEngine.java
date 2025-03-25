package org.example.designpatterns.creational.factory;

public class HighPoweredEngine implements Engine{
    @Override
    public void buildEngine() {
        System.out.println("Build High powered engine!");
    }
}
