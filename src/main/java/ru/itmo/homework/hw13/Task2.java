package ru.itmo.homework.hw13;

interface Eatable extends Serializable{}
interface Runnable {}

class Animal implements Runnable{}

class Cat extends Animal implements Eatable{}
class Kitten extends Cat{}

class Dog extends Animal implements Serializable {}


class Task {
    public static  <T extends Cat & Eatable> void void01(T object){
        // ВОПРОС: методы каких типов можно вызвать у object ???
        // ОТВЕТ: Cat, Animal, Runnable, Eatable, Serializable
    }

    public static  <T extends Animal & Serializable> void void02(T object){
        // ВОПРОС: методы каких типов можно вызвать у object ???
        // ОТВЕТ: Animal, Runnable, Serializable
    }

    public static  <T extends Serializable & Runnable> void void03(T object){
        // ВОПРОС: методы каких типов можно вызвать у object ???
        // ОТВЕТ: Serializable, Runnable
    }

    public static void main(String[] args) {
        Task.</* Cat, Kitten */>void01(/* Cat, Kitten */);
        Task.</* Cat, Kitten, Dog */>void02(/* Cat, Kitten, Dog  */);
        Task.<Dog>void03(/* Dog */);
    }
