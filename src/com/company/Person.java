package com.company;

public class Person {
    private int number;

    public Person() {
    }

    public Person(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Persons - " +
                "number: " + number;
    }
}

