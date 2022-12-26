package org.example.Factory.EnemyShip;

public abstract class EnemyShip {

    private String name;
    private double damage;

    EnemyShip(String name, double damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    void followHeroShip(){
        System.out.println(getName() + " following the hero ship.");
    }

    void displayEnemyShip(){
        System.out.println(getName() + " is on the screen");
    }

    void enemyShipShoots(){
        System.out.println(getName() + " attacks and does " + getDamage());
    }
}
