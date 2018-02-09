package com.Fufu;

public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {

        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){

    }

    private void moveMuscles(){
        System.out.println("You are ");

    }

    private void moveBackFin(){
        System.out.println("Got ");

    }

    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        System.out.println("IT!");
        super.move(speed);
        
    }

    @Override
    public void Fastswim() {
        swim(5);
        super.Fastswim();
    }

    public void lowswim(){
        moveMuscles();
        super.Fastswim();
        System.out.println("You got it!");

    }
}


