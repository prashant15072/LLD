package org.example.designpatterns.structural.decorator;

public class RedColor implements Color{
    @Override
    public void generateColor() {
        System.out.println("Red color generated!");
    }
}
