package com.zegasoftware.service;

import java.util.Objects;

public class Dog extends Animal {

    private String name;
    private int age;

    @Override
    public void eat() {
        System.out.println("Yum yum");

    }

    @Override
    public boolean equals(Object o) {
        //TO DO
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

}
