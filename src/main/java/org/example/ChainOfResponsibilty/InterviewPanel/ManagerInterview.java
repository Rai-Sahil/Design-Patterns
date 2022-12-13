package org.example.ChainOfResponsibilty.InterviewPanel;

public class ManagerInterview implements Chain {
    Chain nextInChain;
    int i = 0;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void interview(Consumer con) {
        if(i == 0){
            System.out.println(con.getName() + " has passed the Manager interview...\n\n");
            nextInChain.interview(con);
        } else{
            System.out.println(con.getName() + " has failed the Manager interview...\n\n");
        }
    }
}
