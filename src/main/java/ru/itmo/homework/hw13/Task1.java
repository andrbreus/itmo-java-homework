package ru.itmo.homework.hw13;

public class Task1 {
    public static void main(String[] args) {
        PairContainer<Number, String> pc01 = new PairContainer<>();
        pc01.setKey(12.2);
        pc01.setValue("strValue");
        System.out.println("pc01: " + pc01);

        PairContainer<String, User<Number>> pc02 = new PairContainer<>();
        pc02.setKey("keyStr");
        User<Number> userNum = new User<>();
        userNum.setId(123L);
        pc02.setValue(userNum);
        System.out.println("pc02: " + pc02);

        PairContainer<String, PairContainer<Number, User<String>>> pc03 = new PairContainer<>();
        User<String> userStr = new User<>();
        userStr.setId("idStr");
        pc03.setKey("keyStr");
        PairContainer<Number, User<String>> pc04 = new PairContainer<>();
        pc03.setValue(pc04);
        pc04.setKey(123.1F);
        pc04.setValue(userStr);
        System.out.println("pc03: " + pc03);
    }
}
