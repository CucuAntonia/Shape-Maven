package com.zegasoftware.service;

import java.util.ArrayList;
import java.util.List;

//PECS - Producer extends Consumer super
public class Wildcard {
    public static void printSomething(List<? extends Animal> animals) {  //Producer
//        animals.add(new Cat()); - Not good
        for (Animal x : animals) {
            x.eat();
        }
    }

    public static void addValue(List<? super Animal> animals) {  //Consumer
        animals.add(new Cat());
        animals.add(new Dog());
//        for (Animal x : animals) { - Not good
//
//        }
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        printSomething(animals);
        List<Cat> cats = new ArrayList<>();
        printSomething(cats);
        List<Dog> dogs = new ArrayList<>();
        printSomething(dogs);
        addValue(animals);
        List<Object> objects = new ArrayList<>();
        addValue(objects);
        List<Being> beings = new ArrayList<>();
        beings.add(new Human());
        beings.add(new Dog());
        addValue(beings);


    }
}
