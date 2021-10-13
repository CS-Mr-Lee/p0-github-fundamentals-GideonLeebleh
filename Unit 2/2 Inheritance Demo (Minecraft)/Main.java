package com.company;

/*
*   To answer questions in work post
*   
*   My mob is the drowned which is basically just an underwater zombie, so it makes grrrr sounds aswell.
*   Creepers make a hiss sound.
*   Because the mob class is a superclass, so any subclasses underneath it (eg mobs) can have methods with the same name that do different things.
*/

class Main {
    public static void main(String[] args) {

        //Zombie

            Zombie myZombie = new Zombie(10,10,20, 22, "Sword");

            System.out.println(myZombie);
            myZombie.move(1,1,1);
            System.out.println(myZombie);
            myZombie.sound();


        //Creeper

            Creeper myCreeper = new Creeper(10,10, 20, 30);

            System.out.println(myCreeper);
            myCreeper.move(1,1,1);
            System.out.println(myCreeper);
            myCreeper.sound();


        //Skeleton

            Skeleton mySkeleton = new Skeleton(10,10, 20, 30);

            System.out.println(mySkeleton);
            myCreeper.move(1,1,1);
            System.out.println(mySkeleton);
            mySkeleton.sound();


        //Drowned

            Drowned myDrowned = new Drowned(10,10,20, 22, "trident");

            System.out.println(myZombie);
            myDrowned.move(1,1,1);
            System.out.println(myDrowned);
            myDrowned.sound();

    }
}
