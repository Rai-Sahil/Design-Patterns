package org.example.ChainOfResponsibilty.InterviewPanel;

public class HRInterview implements Chain {
    Chain nextInChain;
    int i = 0;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void interview(Consumer con) {
        if(i == 0){
            System.out.println(con.getName() + " has passed the HR interview...");
        } else{
            System.out.println(con.getName() + " has failed the HR interview...");
        }
    }
}
