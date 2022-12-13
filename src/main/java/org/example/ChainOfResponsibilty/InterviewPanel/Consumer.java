package org.example.ChainOfResponsibilty.InterviewPanel;

public class Consumer {

    private String name;
    public int score;

    Consumer(String name){
        this.name = name;
        score = 0;
    }

    int getScore() { return score; }
    String getName() { return name; }
}
