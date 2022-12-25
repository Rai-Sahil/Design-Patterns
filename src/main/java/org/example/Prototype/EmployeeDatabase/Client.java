package org.example.Prototype.EmployeeDatabase;

import java.util.HashMap;
import java.util.List;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        Workers oldWorkers = new Workers();
        oldWorkers.loadData();
        oldWorkers.setList("Patrick");

        Workers newWorkers = (Workers) oldWorkers.makeCopy();
        List<String> newWorkersList;
        newWorkersList = newWorkers.getList();
        newWorkersList.add("Num");
        System.out.println("Workers List : " + newWorkersList);

        // Managers
        System.out.println("\n");

        Managers managers = new Managers();
        managers.loadData();

        Managers moreManagers = (Managers) managers.makeCopy();
        HashMap<String, String> newManagers;
        newManagers = moreManagers.getMap();
        newManagers.put("Branch", "Someone");
        System.out.println("Managers : " + newManagers);
    }
}
