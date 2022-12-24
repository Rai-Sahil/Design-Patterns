package org.example.ObserverPattern.YoutubeExample;

public interface ISubject {

    void register(Subscriber subscriber);
    void unRegister(Subscriber subscriber);
    void notifySubscriber();

}
