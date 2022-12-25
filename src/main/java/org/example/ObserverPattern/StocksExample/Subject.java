package org.example.ObserverPattern.StocksExample;

public interface Subject {
    void register(Observer o);
    void unRegister(Observer o);
    void notifyObserver();
}
