package org.example.ObserverPattern.YoutubeExample;

public class Subscriber {

    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(){
        System.out.println("Hey " + name + " Video Uploaded...");
    }

    public void subscribeChannel(Channel name){
        this.channel = name;
    }
}
