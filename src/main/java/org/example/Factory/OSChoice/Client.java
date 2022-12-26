package org.example.Factory.OSChoice;

import java.util.Scanner;

public class Client {

    public static void things(OS osType) {
        osType.specs();
    }

    public static void main(String[] args) {

        OS iPhone = null;
        OSFactoryType type = new OSFactoryType();
        String userInput = "";

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the type of OS you want...");
        userInput = scan.nextLine();

        iPhone = type.choice(userInput);
        things(iPhone);
    }
}
