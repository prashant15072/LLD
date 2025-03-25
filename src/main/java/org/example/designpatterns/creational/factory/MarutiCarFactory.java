package org.example.designpatterns.creational.factory;

public class MarutiCarFactory implements CarFactory{

    @Override
    public void buildEngine() {
        Engine engine = new LowPoweredEngine();
        engine.buildEngine();
    }

    @Override
    public void buildCarType() {
        CarType carType = new Suv();
        carType.buildType();
    }
}
