package com.company;

public class Seaman extends Person implements Swimmable{
    String experience;

    public Seaman() {
    }

    public Seaman(String name, int age, String experience) {
        super(name, age);
        this.experience = experience;
    }

    @Override
    void talk() {
        System.out.println(name + " can talk");
    }

    @Override
    public void swim() {
        System.out.println(name + " can swim");
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Seaman{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experience='" + experience + '\'' +
                "} " + super.toString();
    }
}
