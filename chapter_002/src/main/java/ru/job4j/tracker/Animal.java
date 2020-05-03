package ru.job4j.tracker;

public class Animal {

    public Animal() {
    }

    public Animal(String name) {
        System.out.println("Animal");
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
    }
}

