package com.company;
 /*1. Уй-булолор квартирада, общежитиеде жана гостиницада жашашат
2. Квартирада жашагандар ком услуга толошот
3. Общежитие менен гостиницада жашагандар аренда толошот
4. Уй-булолор бир канча адамдан турушат
5. Кайсы жерде канча адам жашаганын консольго чыгарыныз
6. Жашоо демек озунун адресин корсотуу*/

import com.company.Housing.Flat;
import com.company.Housing.Hostel;
import com.company.Housing.Hotel;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

    Person family = new Person(3);
    Person family2 = new Person(10);
    Person family3 = new Person(5);

    Person[] people = {family};
    Person[] people2 = {family2};
    Person[] people3 = {family3};

        Flat flat = new Flat("East - 5",people2);
        System.out.println(flat);
        flat.commServ();

        System.out.println("---------------------------------------------------");

        Hotel hotel = new Hotel("Djal", people);
        System.out.println(hotel);
        hotel.rent();

        System.out.println("---------------------------------------------------");

        Hostel hostel = new Hostel("Kokjar",people3);
        System.out.println(hostel);
        hostel.rent();





    }
}
