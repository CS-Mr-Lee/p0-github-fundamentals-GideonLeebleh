package com.company;

public class Zombie extends Mob {
    private String weapon;

    public Zombie(int x, int y, int z, int hp, String weapon) {
        super(x, y, z, hp);
        this.weapon = weapon;
    }

    //Accessors


    //Mutators

    public void sound() {
        System.out.println("Grrrrr");
    }

    public void attack() {
        System.out.println("I hit you!");
    }

}
