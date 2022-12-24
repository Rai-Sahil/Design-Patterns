package org.example.ObserverPattern.YoutubeExample;

import java.util.ArrayList;
import java.util.List;

public class Channel implements ISubject{

    private List<Subscriber> subs = new ArrayList<>();
    private String title;

    @Override
    public void register(Subscriber subscriber) {
        subs.add(subscriber);
    }

    @Override
    public void unRegister(Subscriber subscriber){
        subs.remove(subscriber);
    }

    @Override
    public void notifySubscriber(){
        for(Subscriber sub : subs){
            sub.update();
        }
    }

    public void upload(String title){
        this.title = title;
        notifySubscriber();
    }
}
