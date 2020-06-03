package com.epam.learning.TaxiStation;

import java.util.Arrays;
import java.util.List;


public class TaxiStationRunner {

    static List<Car> cars = Arrays.asList(

        new EconomyCar("BMW", 1000, 8, 240),
        new BusinessCar("Nissan", 2500, 10, 200),
        new VIPClass("Mersedes", 4500, 11, 220),
        new EconomyCar("Opel", 2000, 5, 180),
        new BusinessCar("Jeep", 4000, 8, 200));





    public static  void main(String[] args) {

        TaxiStationData car = new TaxiStationData(cars);
        System.out.println("Total Cost Of TaxiCompany: "+ TaxiStationData.cost(cars));
        System.out.println("\n Sorted vehicles by speed " + TaxiStationData.getCarSpeed(cars, 0, 200));
        System.out.println(car.sortCarsByFuelConsumption());


    }
}
