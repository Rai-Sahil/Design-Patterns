package org.example.ObserverPattern;

public interface Subject {

    void register(Observer o);
    void unRegister(Observer o);
    void notifyObserver();
}
