package com.company;

public class Main {
    public static void main(String[] args) {


        Animal[] animals = {new Shark(),
                             new Turtle(),
                                new Eagle()};



        for (Animal animal : animals){
            if (animal instanceof Turtle){
                ((Turtle)animal).Swim();
            }
        }
        for (Animal animal : animals){
            if (animal instanceof Eagle){
                ((Eagle)animal).Fly();
            }
        }
        for(Animal animal : animals){
            if (animal instanceof Shark){
                ((Shark)animal).Attack();
            }
        }

        System.out.println("-----------------------------------");



         for (Animal animal : animals){
             if (animal.getClass().getName().equals("com.company.Turtle")){
                 animal.voice();
             }
         }
         for (Animal animal : animals){
             if (animal.getClass().getName().equals("com.company.Eagle")){
                 animal.voice();
             }
         }
         for (Animal animal : animals){
             if(animal.getClass().getName().equals("com.company.Shark")){
                 animal.voice();
             }
         }
    }
}