package ru.itmo.homework.hw8;

public class Test {
    public static void main(String[] args) {
        ConsoleWriter console = new ConsoleWriter();
        console.log("message from writer");

        AppLogger logger01 = new Delimiter(new Asterisk(new Upper(new Delimiter(new ConsoleWriter()))));
        logger01.log("message from logger01");

        AppLogger logger02 = new Asterisk(new Delimiter(new Delimiter(new ConsoleWriter())));
        logger02.log("message from logger03");

        AppLogger logger03 = new Upper(new Delimiter(new AppFileWriter()));
        logger03.log("message from logger02");
    }
}
