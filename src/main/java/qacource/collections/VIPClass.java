package qacource.collections;

public class VIPClass extends Car {
    private final int price;
    private final int fuelConsumption;
    private final int maxSpeed;
    public String name;

    public VIPClass(String name, int price, int fuelConsumption, int maxSpeed) {
        this.name = name;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String name() {
        return ("It is VIP class");
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int setFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public int compareTo(Car car) {
        return this.fuelConsumption - car.setFuelConsumption();
    }

    @Override
    public String toString() {
        return "EconomyCar{" +
                "price=" + price +
                ", fuelConsumption=" + fuelConsumption +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
