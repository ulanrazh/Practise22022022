package com.company;

import java.util.Arrays;

public class Pool {
    private Swimmable[] people;

    public Pool() {
    }

    public Pool(Swimmable[] people) {
        this.people = people;
    }

    public Swimmable[] getPeople() {
        return people;
    }

    public void setPeople(Swimmable[] people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Pool{" +
                "people=" + Arrays.toString(people) +
                '}';
    }
}

