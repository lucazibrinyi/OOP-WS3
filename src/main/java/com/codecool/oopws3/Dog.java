package com.codecool.oopws3;

public class Dog extends Animal{
    public Dog(String name, Boolean isMale) {
        super(name, isMale);
    }

    @Override
    public void speak() {
        System.out.println("Wuff");
    }
}
