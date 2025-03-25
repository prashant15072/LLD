package org.example.designpatterns.structural.proxy;

public class RealInternetConnection implements Internet{
    @Override
    public void connectToInternet(String url) {
        System.out.println("System connected to "+ url);
    }
}
