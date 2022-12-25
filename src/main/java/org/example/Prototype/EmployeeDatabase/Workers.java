package org.example.Prototype.EmployeeDatabase;

import java.util.ArrayList;
import java.util.List;

public class Workers implements Employees {

    List<String> workers;

    Workers () {
        workers = new ArrayList<>();
    }

    Workers (List<String> list) {
        this.workers = list;
    }

    void loadData() {
        workers.add("Sahil");
        workers.add("Hello");
        workers.add("World");
    }

    public List<String> getList() {
        return workers;
    }

    public void setList(String name) {
        workers.add(name);
    }

    @Override
    public Employees makeCopy() throws CloneNotSupportedException {
        System.out.println("Worker Being Made");
        Workers worker = new Workers();
        worker = (Workers) super.clone();
        return worker;
    }
}
