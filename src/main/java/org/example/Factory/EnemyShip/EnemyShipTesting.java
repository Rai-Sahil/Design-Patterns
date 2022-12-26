package org.example.Factory.EnemyShip;

import java.util.Scanner;

public class EnemyShipTesting {

    public static void main(String[] args) {

        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip theEnemy = null;
        Scanner scan = new Scanner(System.in);
        String type = "";
        System.out.println("What type of enemy ship you wanna fight? ");
        if(scan.hasNextLine()) type = scan.nextLine();
        theEnemy = shipFactory.makeShip(type);
        doStuffEnemy(theEnemy);

    }

    public static void doStuffEnemy(EnemyShip ship) {
        ship.displayEnemyShip();
        ship.followHeroShip();
        ship.enemyShipShoots();
    }
}
