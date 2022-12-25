package org.example.ObserverPattern.StocksExample;

public interface Observer {
    void update(double ibmPrice, double aaplPrice, double googPrice);
}
