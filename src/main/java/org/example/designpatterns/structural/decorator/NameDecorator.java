package org.example.designpatterns.structural.decorator;

public class NameDecorator extends ColorDecorator{
    public NameDecorator(Color color) {
        super(color);
    }

    @Override
    public void generateColor() {
        super.generateColor();
        System.out.println("Mine!");
    }
}
