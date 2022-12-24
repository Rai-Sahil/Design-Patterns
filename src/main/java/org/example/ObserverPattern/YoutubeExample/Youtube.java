package org.example.ObserverPattern.YoutubeExample;

public class Youtube {

    public static void main(String[] args) {
        Channel sahil = new Channel();

        Subscriber s1 = new Subscriber("Sahil");
        Subscriber s2 = new Subscriber("Aryan");
        Subscriber s3 = new Subscriber("Hello");
        Subscriber s4 = new Subscriber("World");
        Subscriber s5 = new Subscriber("Rai");

        sahil.register(s1);
        sahil.register(s2);
        sahil.register(s3);
        sahil.register(s4);
        sahil.register(s5);

        s1.subscribeChannel(sahil);
        s2.subscribeChannel(sahil);
        s3.subscribeChannel(sahil);
        s4.subscribeChannel(sahil);
        s5.subscribeChannel(sahil);

        sahil.upload("Java");

        sahil.unRegister(s3);
    }

}
