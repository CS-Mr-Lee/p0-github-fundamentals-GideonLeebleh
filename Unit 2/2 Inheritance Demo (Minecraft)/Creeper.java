package com.company;

public class Creeper extends Mob {


    public Creeper(int x, int y, int z, int hp) {
        super(x, y, z, hp);
    }

    //Accessors


    //Mutators

    public void sound() {
        System.out.println("Hiss");
    }

    public void explode() {
        this.sound();
        System.out.println("Explode");
    }
}
