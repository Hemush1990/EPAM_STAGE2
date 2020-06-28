package com.epam.learning.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TaxiStationData {

    private static List<? extends Car> cars;

    public TaxiStationData(List<Car> cars) {
        TaxiStationData.cars = cars;
    }

    public static int cost(List<Car> cars) {
        int cost = 0;
        for (Car car : cars) {
            cost = cost + car.getPrice();
        }
        return cost;
    }

    public static List<Car> getCarSpeed(List<Car> cars, int min, int max) {
        List<Car> carsBySpeedRange = new ArrayList<>();
        for (Car car : cars) {
            if (car.getMaxSpeed() >= min && car.getMaxSpeed() <= max) {
                carsBySpeedRange.add(car);
            }
        }
        return carsBySpeedRange;
    }

    public TaxiStationData sortCarsByFuelConsumption() {

        Collections.sort(cars, new Comparator<Car>() {

            public int compare(Car car1, Car car2) {
                return car1.setFuelConsumption() - car2.setFuelConsumption();
            }
        });
        return this;
    }

}