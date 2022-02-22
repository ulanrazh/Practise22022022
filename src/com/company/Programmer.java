package com.company;

public class Programmer extends Person implements Swimmable, CanDrive{
    String genre;

    public Programmer() {
    }

    public Programmer(String name, int age, String genre) {
        super(name, age);
        this.genre = genre;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", genre='" + genre + '\'' +
                "} " + super.toString();
    }

}
