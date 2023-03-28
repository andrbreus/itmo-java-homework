package ru.itmo.homework.hw6;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        var everest = new Mountain("Everest", "Nepal", 8848);
        var ararat = new Mountain("Ararat", "Turkey", 5137);
        var elbrus = new Mountain("Elbrus", "Russia", 5642);

        var alpinist01 = new Alpinist("James S. Floyd", "1569 Arbor Court Cheyenne, WY 82003");
        var alpinist02 = new Alpinist("Lynn L. Carrion", "2226 White Lane Macon, GA 31201");
        var alpinist03 =
                new Alpinist("Eden C. Martinez", "4588 Sampson Street Coal Creek Canyon, CO 81221");

        Group group01 = new Group(3, new ArrayList<>(List.of(alpinist01, alpinist02, alpinist03)), everest);

        Group group02 = new Group(3, new ArrayList<>() {
            {
                add(new Alpinist("Suzanne W. Bill", "242 Park Street San Francisco, CA 94104"));
                add(new Alpinist("Kyle P. McManus", "2518 Lilac Lane Savannah, GA 31401"));
            }
        }, ararat);

        Group group03 = new Group(3, new ArrayList<>() {
            {
                add(new Alpinist("Robyn J. Johnson", "2656 Oakwood Circle Mission Viejo, CA 92692"));
                add(new Alpinist("Susan H. Powers", "484 Stonepot Road Newark, NJ 07102"));
            }
        }, ararat);

        System.out.println("Group 1:");
        System.out.println(group01);

        System.out.println("Group 2:");
        System.out.println(group02);

        group02.addAlpinist(new Alpinist("Sarah M. Lord", "2291 Benedum Drive Orangeburg, NY 10962"));

        System.out.println("Group 2 (alpinist added):");
        System.out.println(group02);

        System.out.println("Group 3:");
        System.out.println(group03);

        try {
            group01.addAlpinist(new Alpinist("qwerty", "qwerty"));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
