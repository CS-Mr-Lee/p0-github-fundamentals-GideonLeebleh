package com.company;

/*
*   The drowned is basically just a zombie that spawns underwater
*/
public class Drowned extends Mob{

    private String weapon;

    public Drowned(int x, int y, int z, int hp, String weapon) {
        super(x, y, z, hp);
        this.weapon = weapon;
    }

    //Accessors


    //Mutators

    public void sound() {
        System.out.println("*Under water* Grrrrr");
    }

    public void attack() {
        System.out.println("*Under water* I hit you!");
    }

    public void swim() {
        System.out.println("Swims");
    }

}

