package com.company;

public class Mob {
    private int x,y,z;
    private int hp;

    public Mob(int x, int y, int z, int hp) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.hp = hp;
    }

    //Accessors

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getZ() {
        return this.z;
    }

    public int getHP() {
        return this.hp;
    }

    //Mutators
    public void move(int xChange, int yChange, int zChange) {
        this.x += xChange;
        this.y += yChange;
        this.z += zChange;
    }

    public void sound() {
        System.out.println("????");
    }

    public String toString() {
        String ret = "x: " + this.x + " " +
                "y: " + this.y + " " +
                "z: " + this.z + " " +
                "Hp: " + this.hp;
        return ret;
    }
}
