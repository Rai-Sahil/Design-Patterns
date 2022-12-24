package org.example.Iterator.HashMapIteratorPattern;

import java.util.Iterator;
import java.util.List;

public class Listen {

    Object object;

    Listen (Object newObject) {
        this.object = newObject;
    }

    void print(){
        Iterator obj = object.createIterate();
        show(obj);
    }

    void show(Iterator iterator){
        while(iterator.hasNext()){
            Thing th = (Thing) iterator.next();

            System.out.println(th.getName());
        }
    }

    public static void main (String[] args){
        Object ob = new Object();

        Listen listen = new Listen(ob);
        listen.print();
    }
}
