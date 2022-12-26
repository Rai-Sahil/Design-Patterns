package org.example.Factory.EnemyShip;

public class EnemyShipFactory {

    public EnemyShip makeShip (String newShip) {
        EnemyShip newSHip = null;

        return switch (newShip) {
            case "U" -> new UFOEnemyShip();
            case "R" -> new RocketEnemyShip();
            case "B" -> new BigUFOEnemyShip();
            default -> null;
        };
    }

}
