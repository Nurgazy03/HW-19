package com.company.Housing;

import com.company.Interfaces.Rent;
import com.company.Person;

import java.util.Arrays;

public class Hotel implements Rent {

    private String address;
    private Person[] hotel;

    public Hotel() {
    }

    public Hotel(String address, Person[] hotel) {
        this.address = address;
        this.hotel = hotel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person[] getHotel() {
        return hotel;
    }

    public void setHotel(Person[] hotel) {
        this.hotel = hotel;
    }

    @Override
    public void rent() {
        System.out.println("This family pay 300$ for rent a month");
    }

    @Override
    public String toString() {
        return "Hotel information" + '\n' +
                "address: " + address + '\n' +
                "hotel: " + Arrays.toString(hotel);
    }
}
