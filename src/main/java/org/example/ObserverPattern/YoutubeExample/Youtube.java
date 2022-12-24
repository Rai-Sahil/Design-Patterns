package org.example.ObserverPattern.YoutubeExample;

public class Youtube {

    public static void main(String[] args) {
        Channel sahil = new Channel();

        //Making Subscribers
        Subscriber s1 = new Subscriber("Sahil");
        Subscriber s2 = new Subscriber("Aryan");
        Subscriber s3 = new Subscriber("Hello");
        Subscriber s4 = new Subscriber("World");
        Subscriber s5 = new Subscriber("Rai");

        //Registering Subscribers
        sahil.register(s1);
        sahil.register(s2);
        sahil.register(s3);
        sahil.register(s4);
        sahil.register(s5);

        //Subscribing to channels
        s1.subscribeChannel(sahil);
        s2.subscribeChannel(sahil);
        s3.subscribeChannel(sahil);
        s4.subscribeChannel(sahil);
        s5.subscribeChannel(sahil);

        //Uploading Video
        sahil.upload("Java");

        //Unsubscribing...
        sahil.unRegister(s3);
    }

}
