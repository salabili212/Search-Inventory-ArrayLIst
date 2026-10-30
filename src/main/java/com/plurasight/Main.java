package com.plurasight;
import java.io.BufferedReader;
import java.io.FileReader;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //declear an arraylist of Vehicle
        ArrayList<Vehicle> vehicles = new ArrayList<>();


        //adding product to the car inventory By ID Name Price
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

        //Loops through everything in the arrayList
        for(Vehicle vehicle: vehicles){
            vehicle.getInventory();
        }

        //read from the 




    }
}
