package org.example.designpatterns.creational.singleton;

import java.util.Objects;

public class SingletonClass {

    private static SingletonClass singletonClass;
    private SingletonClass(){
    }

    public static SingletonClass getSingletonClass(){
        if (Objects.isNull(singletonClass)){
            singletonClass= new SingletonClass();
        }

        return singletonClass;
    }
}
