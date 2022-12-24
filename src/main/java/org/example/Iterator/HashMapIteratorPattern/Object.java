package org.example.Iterator.HashMapIteratorPattern;

import java.util.HashMap;
import java.util.Iterator;

public class Object implements Iterative {

    int hashKey = 0;
    HashMap<Integer, Thing> hashmap = new HashMap<>();

    Object() {
        add(1, "Sahil");
        add(2, "Aryan");
        add(3, "Hello");
        add(4, "World");
    }

    void add(int num, String name) {
        Thing thing = new Thing(name, num);
        hashmap.put(num, thing);
        hashKey++;
    }

    @Override
    public Iterator createIterate() {
        return hashmap.values().iterator();
    }
}
