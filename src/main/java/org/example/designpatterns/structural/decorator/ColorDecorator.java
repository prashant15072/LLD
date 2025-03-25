package org.example.designpatterns.structural.decorator;

public abstract class ColorDecorator implements Color{
    private final Color color;

    public ColorDecorator(Color color) {
        this.color = color;
    }

    @Override
    public void generateColor() {
        color.generateColor();
    }
}
