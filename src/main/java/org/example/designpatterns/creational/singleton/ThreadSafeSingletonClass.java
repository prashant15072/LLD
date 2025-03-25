package org.example.designpatterns.creational.singleton;

public class ThreadSafeSingletonClass {
    private static ThreadSafeSingletonClass singletonClass;

    private ThreadSafeSingletonClass(){}

    private static class SingletonHelper{
        private static final ThreadSafeSingletonClass INSTANCE = new ThreadSafeSingletonClass();
        //Lazy Initialisation
    }

    public static ThreadSafeSingletonClass getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
