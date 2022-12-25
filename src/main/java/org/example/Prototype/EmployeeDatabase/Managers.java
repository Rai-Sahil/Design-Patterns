package org.example.Prototype.EmployeeDatabase;

import java.util.HashMap;

public class Managers implements Employees{

    HashMap<String, String> managers;

    Managers (){
        managers = new HashMap<>();
    }

    Managers (HashMap<String, String> managers) {
        this.managers = managers;
    }

    void loadData(){
        managers.put("General", "Rai");
        managers.put("HR", "HW");
    }

    HashMap<String, String> getMap() { return managers; }

    @Override
    public Employees makeCopy() throws CloneNotSupportedException {
        System.out.println("Managers are being made...");
        Managers manager;
        manager = (Managers) super.clone();
        return manager;
    }
}
