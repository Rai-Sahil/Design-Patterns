package org.example.ChainOfResponsibilty.InterviewPanel;

public class Hiring {

    public static void main(String[] args){
        Chain chainTec = new TechnicalInterview();
        Chain chainMan = new ManagerInterview();
        Chain chainHR = new HRInterview();

        chainTec.setNextChain(chainMan);
        chainMan.setNextChain(chainHR);

        Consumer consumer = new Consumer("sahil");

        chainTec.interview(consumer);
    }
}
