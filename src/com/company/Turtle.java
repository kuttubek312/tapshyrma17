package com.company;

public class Turtle extends Animal{                        //  черепаха

    public void Swim(){
        System.out.println("Ocean turtle can swim");

    }

    @Override
    public String toString() {
        return "Turtle{}";
    }
}
