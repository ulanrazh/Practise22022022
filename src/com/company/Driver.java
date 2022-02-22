package com.company;

public class Driver extends Person implements CanDrive{
    String driverCar;

    public Driver() {
    }

    public Driver(String name, int age, String driverCar) {
        super(name, age);
        this.driverCar = driverCar;
    }

    @Override
    void talk() {
        System.out.println(name + " can talk");
    }

    @Override
    public void drive() {
        System.out.println(name + " can drive");
    }

    public String getDriverCar() {
        return driverCar;
    }

    public void setDriverCar(String driverCar) {
        this.driverCar = driverCar;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverCar='" + driverCar + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                "} " + super.toString();
    }
}
