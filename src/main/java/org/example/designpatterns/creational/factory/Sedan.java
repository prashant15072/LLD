package org.example.designpatterns.creational.factory;

public class Sedan implements CarType{
    @Override
    public void buildType() {
        System.out.println("Building Sedan!");
    }
}
