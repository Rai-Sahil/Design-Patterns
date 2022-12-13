package org.example.ChainOfResponsibilty.InterviewPanel;

public interface Chain {

    void interview(Consumer con);

    void setNextChain(Chain nextChain);
}
