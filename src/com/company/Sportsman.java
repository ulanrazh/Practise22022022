package com.company;

public class Sportsman extends Person implements Swimmable, CanDrive{
    String typeOfSport;

    public Sportsman() {
    }

    public Sportsman(String name, int age, String typeOfSport) {
        super(name, age);
        this.typeOfSport = typeOfSport;
    }

    @Override
    void talk() {
        System.out.println(name + " can talk");
    }

    @Override
    public void drive() {
        System.out.println(name + " can drive");
    }

    @Override
    public void swim() {
        System.out.println(name + " can swim");
    }

    @Override
    public String toString() {
        return "Sportsman{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", typeOfSport='" + typeOfSport + '\'' +
                "} " + super.toString();
    }
}
