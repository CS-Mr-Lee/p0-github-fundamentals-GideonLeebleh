package com.company;

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
