package com.company;

public class Skeleton extends Mob {
    private String weapon;

    public Skeleton(int x, int y, int z, int hp) {
        super(x, y, z, hp);
    }

    //Accessors


    //Mutators

    public void sound() {
        System.out.println("Spooky, scary skeletons Send shivers down your spine");
    }

    public void shoot() {
        System.out.println("*Shoots arrows from bow*");
    }

}