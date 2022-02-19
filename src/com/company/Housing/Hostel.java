package com.company.Housing;

import com.company.Interfaces.Rent;
import com.company.Person;

import java.util.Arrays;

public class Hostel implements Rent {
    private String address;
    private Person[] hostel;

    public Hostel() {
    }

    public Hostel(String address, Person[] hostel) {
        this.address = address;
        this.hostel = hostel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person[] getHostel() {
        return hostel;
    }

    public void setHostel(Person[] hostel) {
        this.hostel = hostel;
    }

    @Override
    public void rent() {
        System.out.println("This family pay 80$ for rent a day ");
    }

    @Override
    public String toString() {
        return "Hostel information " +"\n"+
                "address: " + address + '\n' +
                "hostel: " + Arrays.toString(hostel);
    }
}
