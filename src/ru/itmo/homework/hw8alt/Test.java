package ru.itmo.homework.hw8alt;

public class Test {
    public static void main(String[] args) {
        ConsoleWriter console = new ConsoleWriter();
        console.log("message from console writer");

        AppLogger logger01 = new Asterisk(new Upper(new Delimiter(new ConsoleWriter())));
        logger01.log("formatted message from logger01");
    }
}
