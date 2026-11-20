package com.plurasight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = getInventory();

        for (Vehicle vehicle : vehicles) {
            vehicle.getInventory();
        }
    }

    public static ArrayList<Vehicle> getInventory() {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Vehicle car1 = new Vehicle("1001|Drill|49.99");
        Vehicle car2 = new Vehicle("1002|Saw|24.99");
        Vehicle car3 = new Vehicle("1003|Wrench|14.50");
        Vehicle car4 = new Vehicle("1004|Pliers|11.99");
        Vehicle car5 = new Vehicle("1005|Safety glasses|6.99");

        vehicles.add(car1);
        vehicles.add(car2);
        vehicles.add(car3);
        vehicles.add(car4);
        vehicles.add(car5);

        return vehicles;
    }
}