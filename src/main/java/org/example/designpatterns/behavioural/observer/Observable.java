package org.example.designpatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    private final List<Observer> observerList;
    private String state;

    public Observable() {
        this.state = "state";
        this.observerList = new ArrayList<>();
    }

    public void subscribe(Observer observer){
        observerList.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observerList.remove(observer);
    }

    public void setState(String newState) {
        this.state = newState;
        notifyObservers();
    }
    public void notifyObservers(){
        observerList.forEach(Observer::doAction);
    }
}
