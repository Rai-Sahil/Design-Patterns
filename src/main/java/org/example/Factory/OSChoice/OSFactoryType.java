package org.example.Factory.OSChoice;

public class OSFactoryType {

    public OS choice(String type){
        if(type.equals("Open Source")){
            return new Android();
        } else if (type.equals("Closed Source")) {
            return new IOS();
        } else {
            return new Windows();
        }
    }
}
