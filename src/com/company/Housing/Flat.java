package com.company.Housing;

import com.company.Interfaces.CommServ;
import com.company.Person;

import java.util.Arrays;

public class Flat implements CommServ {

    private String address;
    private Person[] flat;

    public Flat(String address, Person[] flat) {
        this.address = address;
        this.flat = flat;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person[] getFlat() {
        return flat;
    }

    public void setFlat(Person[] flat) {
        this.flat = flat;
    }

    @Override
    public void commServ() {
        System.out.println("This family pay 50$ for communal service a month");
    }

    @Override
    public String toString() {
        return "Flat information " + "\n"+
                "address: " + address + '\n' +
                "flat: " + Arrays.toString(flat);
    }
}
