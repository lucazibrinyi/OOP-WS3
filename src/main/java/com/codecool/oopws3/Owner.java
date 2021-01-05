package com.codecool.oopws3;

import java.util.ArrayList;
import java.util.List;

public class Owner {
    List<Animal> animals;

    public Owner(){
        animals = new ArrayList<>();
        animals.add(new Cat("Mici", false));
        animals.add(new Dog("Frakk",true));
        //animals.add(new Cat("Neko", true));
       // animals.add(new Dog("Cane",false));
    }

    public void feed(){
        for (Animal animals : this.animals){
            animals.feed();

        }
    }

}
