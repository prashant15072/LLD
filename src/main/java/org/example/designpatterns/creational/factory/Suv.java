package org.example.designpatterns.creational.factory;

public class Suv implements CarType{
    @Override
    public void buildType() {
        System.out.println("Building SUV!");
    }
}
