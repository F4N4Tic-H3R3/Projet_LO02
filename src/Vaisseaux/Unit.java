package Vaisseaux;

import Map.System;
import Map.Tile;

public abstract class Unit {



    public void move(Tile tile) {

    }

    public void addShip() {

    }

    public void removeShip(int i) { //changé de "remove" à "removeShip"

    }

    public void invade(System system) {

    }

    public void fight(Unit unit) {

    }

    public boolean isFleet() {
        return true; // Placeholder
    }
}
