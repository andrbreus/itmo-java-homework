package ru.itmo.homework.hwMaven;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonApp {
    public static void main(String[] args) {
        File jsonFile = new File("src/main/java/ru/itmo/homework/hwMaven/cat.json");

        ObjectMapper om = new ObjectMapper();

        Cat catFromJson = null;

        try {
            catFromJson = om.readValue(jsonFile, Cat.class);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        if (catFromJson != null) {
            System.out.println(catFromJson);
        }
    }
}
