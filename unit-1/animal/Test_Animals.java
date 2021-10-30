package com.company;
import java.util.Scanner;

public class Test_Animals {

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        String var;
        String choice;
        int num;
        int num2;
        char varC;
        boolean bool = true;

        System.out.println();   //space

        System.out.println("Pick an animal of either cow, moose or cat");
        System.out.println("You will be stuck with this animal till the program closes, so choose wisely");
        System.out.println("The animals fight, sleep, eat, and poo. Only the cow can't fight but it can moo instead.");
        System.out.print("What will it be: ");
        choice = in.nextLine();

        System.out.println();   //space

        /**
         * moose
         */
        if (choice.equalsIgnoreCase("Moose"))
        {

            Moose moose = new Moose("none", "none", "none", "homeless", 'n', 50, 0, 0);

            System.out.print("Enter your moose's name: ");
            moose.Name = in.nextLine();
            System.out.println();

            System.out.print("Enter your moose's favorite food: ");
            moose.FavFood = in.nextLine();
            System.out.println();

            System.out.print("Enter your moose's size: ");
            moose.Size = in.nextLine();
            System.out.println();

            System.out.print("Enter your moose's sex: ");
            moose.Sex = in.next().charAt(0);
            System.out.println();

            System.out.print("Enter your moose's age: ");
            moose.setAge(in.nextInt());
            System.out.println();

            System.out.print("Enter your moose's weight: ");
            moose.setWeight(in.nextDouble());
            System.out.println();


            while (bool == true) {

                if (moose.getWeight() <= 0) //moose resurrection if moose dies
                {
                    in.nextLine();

                    System.out.print("Enter your moose's name: ");
                    moose.Name = in.nextLine();
                    System.out.println();

                    System.out.print("Enter your moose's favorite food: ");
                    moose.FavFood = in.nextLine();
                    System.out.println();

                    System.out.print("Enter your moose's size: ");
                    moose.Size = in.nextLine();
                    System.out.println();

                    System.out.print("Enter your moose's sex: ");
                    moose.Sex = in.next().charAt(0);
                    System.out.println();

                    System.out.print("Enter your moose's age: ");
                    moose.setAge(in.nextInt());
                    System.out.println();

                    System.out.print("Enter your moose's weight: ");
                    moose.setWeight(in.nextDouble());
                    System.out.println();
                }

                var = in.nextLine();


                /**
                 * Actions that can be done
                 */
                if (var.equals("fight"))    //fight action
                {
                    moose.fight(true);
                    System.out.println();
                }

                else if (var.equals("sleep")) //sleep action
                {
                    System.out.print("How many hours will " + moose.Name + " sleep: ");
                    num = in.nextInt();
                    moose.sleep(num);
                    System.out.println();
                }

                else if (var.equals("run")) //run action
                {
                    System.out.print("How far will your moose run? ");
                    num = in.nextInt();
                    System.out.print("How long will your moose run for? ");
                    num2 = in.nextInt();
                    moose.run(num, num2);
                    System.out.println();
                }

                else if (var.equals("eat")) //eat action
                {
                    System.out.print("Is the moose eating meat or vegetables: ");
                    var = in.nextLine();

                    if (var.equals("meat")) {
                        moose.eat(true);
                    } else if (var.equals("vegetables")) {
                        moose.eat(false);
                    }
                    System.out.println();
                }

                else if (var.equals("poo")) //poo action
                {
                    System.out.print("How much weight will your moose unload: ");
                    num = in.nextInt();
                    moose.poo(num);
                    System.out.println();
                }


                /**
                 * Info about the moose
                 */
                else if (var.equals("name")) {
                    var = moose.Name;
                    System.out.println(var);
                    System.out.println();
                }

                else if (var.equals("food")) {
                    var = moose.FavFood;
                    System.out.println(var);
                    System.out.println();
                }

                else if (var.equals("size")) {
                    var = moose.Size;
                    System.out.println(var);
                    System.out.println();
                }

                else if (var.equals("habitat")) {
                    var = moose.Habitat;
                    System.out.println(var);
                    System.out.println();
                }

                else if (var.equals("sex")) {
                    varC = moose.Sex;
                    System.out.println(varC);
                    System.out.println();
                }

                else if (var.equals("energy")) {
                    System.out.println(moose.getEnergyLevel());
                    System.out.println();
                }

                else if (var.equals("age")) {
                    System.out.println(moose.getAge());
                    System.out.println();
                }

                else if (var.equals("weight")) {
                    System.out.println(moose.getWeight());
                    System.out.println();
                }
            }
        }

        /**
         * Cat
         */
        else if (choice.equalsIgnoreCase("Cat"))
        {
            Cat cat = new Cat("none", "none", "none", "homeless", 'n', 50, 0, 0, "none", "none");

            System.out.print("Enter your cat's name: ");
            cat.Name = in.nextLine();
            System.out.println();

            System.out.print("Enter your cat's favorite food: ");
            cat.FavFood = in.nextLine();
            System.out.println();

            System.out.print("Enter your cat's size: ");
            cat.Size = in.nextLine();
            System.out.println();

            System.out.print("Enter your cat's sex: ");
            cat.Sex = in.next().charAt(0);
            System.out.println();

            System.out.print("Enter your cat's age: ");
            cat.setAge(in.nextInt());
            System.out.println();

            System.out.print("Enter your cat's weight: ");
            cat.setWeight(in.nextDouble());
            System.out.println();

            in.nextLine();  //serves as way for breed to get input

            System.out.print("Enter your cat's breed: ");
            cat.setBreed(in.nextLine());
            System.out.println();

            System.out.print("Enter the colour of your cat: ");
            cat.setColour(in.nextLine());
            System.out.println();


            while (bool == true)
            {

                if (cat.getWeight() <= 0) //cat resurrection if cat dies
                {
                    in.nextLine();

                    System.out.print("Enter your cat's name: ");
                    cat.Name = in.nextLine();
                    System.out.println();

                    System.out.print("Enter your cat's favorite food: ");
                    cat.FavFood = in.nextLine();
                    System.out.println();

                    System.out.print("Enter your cat's size: ");
                    cat.Size = in.nextLine();
                    System.out.println();

                    System.out.print("Enter your cat's sex: ");
                    cat.Sex = in.next().charAt(0);
                    System.out.println();

                    System.out.print("Enter your cat's age: ");
                    cat.setAge(in.nextInt());
                    System.out.println();

                    System.out.print("Enter your cat's weight: ");
                    cat.setWeight(in.nextDouble());
                    System.out.println();

                    in.nextLine();  //serves as way for breed to get input

                    System.out.print("Enter your cat's breed: ");
                    cat.setBreed(in.nextLine());
                    System.out.println();

                    System.out.print("Enter the colour of your cat: ");
                    cat.setColour(in.nextLine());
                    System.out.println();
                }

                var = in.nextLine();

                /**
                 * Actions that can be done
                 */
                if (var.equals("fight"))    //fight action
                {
                    cat.fight(true);
                    System.out.println();
                }

                else if (var.equals("sleep")) //sleep action
                {
                    System.out.print("How many hours will " + cat.Name + " sleep: ");
                    num = in.nextInt();
                    cat.sleep(num);
                    System.out.println();
                }

                else if (var.equals("run")) //run action
                {
                    System.out.print("How far will your cat run? ");
                    num = in.nextInt();
                    System.out.print("How long will your cat run for? ");
                    num2 = in.nextInt();
                    cat.run(num, num2);
                    System.out.println();
                }

                else if (var.equals("eat")) //eat action
                {
                    System.out.print("Is the cat eating meat or vegetables: ");
                    var = in.nextLine();

                    if (var.equals("meat"))
                    {
                        cat.eat(true);
                    }

                    else if (var.equals("vegetables"))
                    {
                        cat.eat(false);
                    }
                    System.out.println();
                }

                else if (var.equals("poo")) //poo action
                {
                    System.out.print("How much weight will your cat unload: ");
                    num = in.nextInt();
                    cat.poo(num);
                    System.out.println();
                }


                /**
                 * Info about the cat
                 */
                else if (var.equals("name"))
                {
                    var = cat.Name;
                    System.out.println(var);
                    System.out.println();
                }

                else if (var.equals("food"))
                {
                    var = cat.FavFood;
                    System.out.println(var);
                    System.out.println();
                }

                else if (var.equals("size"))
                {
                    var = cat.Size;
                    System.out.println(var);
                    System.out.println();
                }

                else if (var.equals("habitat"))
                {
                    var = cat.Habitat;
                    System.out.println(var);
                    System.out.println();
                }

                else if (var.equals("sex"))
                {
                    varC = cat.Sex;
                    System.out.println(varC);
                    System.out.println();
                }

                else if (var.equals("energy"))
                {
                    System.out.println(cat.getEnergyLevel());
                    System.out.println();
                }

                else if (var.equals("age"))
                {
                    System.out.println(cat.getAge());
                    System.out.println();
                }

                else if (var.equals("weight"))
                {
                    System.out.println(cat.getWeight());
                    System.out.println();
                }

                else if (var.equals("breed"))
                {
                    System.out.println(cat.getBreed());
                    System.out.println();
                }

                else if (var.equals("colour"))
                {
                    System.out.println(cat.getColour());
                    System.out.println();
                }
            }
        }


        /**
         * Cow
         */
        else if (choice.equalsIgnoreCase("Cow"))
        {
            Cow cow = new Cow("none", "none", "none", "homeless", 'n', 50, 0, 0, "none");

            System.out.print("Enter your cow's name: ");
            cow.Name = in.nextLine();
            System.out.println();

            System.out.print("Enter your cow's favorite food: ");
            cow.FavFood = in.nextLine();
            System.out.println();

            System.out.print("Enter your cow's size: ");
            cow.Size = in.nextLine();
            System.out.println();

            System.out.print("Enter your cow's sex: ");
            cow.Sex = in.next().charAt(0);
            System.out.println();

            System.out.print("Enter your cow's age: ");
            cow.setAge(in.nextInt());
            System.out.println();

            System.out.print("Enter your cow's weight: ");
            cow.setWeight(in.nextDouble());
            System.out.println();

            in.nextLine();  //serves as way for colour to get input

            System.out.print("Enter the colour of your cow: ");
            cow.setColour(in.nextLine());
            System.out.println();


            while (bool == true)
            {

                if (cow.getWeight() <= 0) //cow resurrection if cow dies
                {
                    in.nextLine();

                    System.out.print("Enter your cow's name: ");
                    cow.Name = in.nextLine();
                    System.out.println();

                    System.out.print("Enter your cow's favorite food: ");
                    cow.FavFood = in.nextLine();
                    System.out.println();

                    System.out.print("Enter your cow's size: ");
                    cow.Size = in.nextLine();
                    System.out.println();

                    System.out.print("Enter your cow's sex: ");
                    cow.Sex = in.next().charAt(0);
                    System.out.println();

                    System.out.print("Enter your cow's age: ");
                    cow.setAge(in.nextInt());
                    System.out.println();

                    System.out.print("Enter your cow's weight: ");
                    cow.setWeight(in.nextDouble());
                    System.out.println();

                    in.nextLine();  //serves as way for colour to get input

                    System.out.print("Enter the colour of your cow: ");
                    cow.setColour(in.nextLine());
                    System.out.println();
                }

                var = in.nextLine();

                /**
                 * Actions that can be done
                 */
                if (var.equals("moo"))    //fight action
                {
                    cow.moo();
                    System.out.println();
                }

                else if (var.equals("sleep")) //sleep action
                {
                    System.out.print("How many hours will " + cow.Name + " sleep: ");
                    num = in.nextInt();
                    cow.sleep(num);
                    System.out.println();
                }

                else if (var.equals("run")) //run action
                {
                    System.out.print("How far will your cow run? ");
                    num = in.nextInt();
                    System.out.print("How long will your cow run for? ");
                    num2 = in.nextInt();
                    cow.run(num, num2);
                    System.out.println();
                }

                else if (var.equals("eat")) //eat action
                {
                    System.out.print("Is the cow eating meat or vegetables: ");
                    var = in.nextLine();

                    if (var.equals("meat"))
                    {
                        cow.eat(true);
                    }

                    else if (var.equals("vegetables"))
                    {
                        cow.eat(false);
                    }
                    System.out.println();
                }

                else if (var.equals("poo")) //poo action
                {
                    System.out.print("How much weight will your cow unload: ");
                    num = in.nextInt();
                    cow.poo(num);
                    System.out.println();
                }


                /**
                 * Info about the cow
                 */
                else if (var.equals("name"))
                {
                    var = cow.Name;
                    System.out.println(var);
                    System.out.println();
                }

                else if (var.equals("food"))
                {
                    var = cow.FavFood;
                    System.out.println(var);
                    System.out.println();
                }

                else if (var.equals("size"))
                {
                    var = cow.Size;
                    System.out.println(var);
                    System.out.println();
                }

                else if (var.equals("habitat"))
                {
                    var = cow.Habitat;
                    System.out.println(var);
                    System.out.println();
                }

                else if (var.equals("sex"))
                {
                    varC = cow.Sex;
                    System.out.println(varC);
                    System.out.println();
                }

                else if (var.equals("energy"))
                {
                    System.out.println(cow.getEnergyLevel());
                    System.out.println();
                }

                else if (var.equals("age"))
                {
                    System.out.println(cow.getAge());
                    System.out.println();
                }

                else if (var.equals("weight"))
                {
                    System.out.println(cow.getWeight());
                    System.out.println();
                }

                else if (var.equals("colour"))
                {
                    System.out.println(cow.getColour());
                    System.out.println();
                }
            }
        }

        /**
         * Instance example
         * I don't completely know if this is right or not so look into that.
         */
        else if(choice.equalsIgnoreCase("instance"))
        {
            Cow cow = new Cow("none", "none", "none", "homeless", 'n', 50, 0, 0, "none");
            System.out.println(cow instanceof Animals);

            Animals cow2 = new Cow("none", "none", "none", "homeless", 'n', 50, 0, 0, "none");
            System.out.println(cow2 instanceof Animals);
        }

        /**
         * Casting example
         * Like instance of, I don't know if this is right or not, the output for certain is wack, do fix later.
         */
        else if(choice.equalsIgnoreCase("cast"))
        {
            Cow cow = new Cow("cow", "cow", "cow", "cow", 'c', 0, 0, 0, "cow");
            System.out.println(cow);

            Animals An = new Animals(cow.Name, cow.FavFood, cow.Size, cow.Habitat, cow.Sex, cow.getEnergyLevel(), cow.getAge(), cow.getWeight()); //widening casting
            System.out.println(cow);
            System.out.println(An);

            Cow bob = new Cow(An.Name, An.FavFood, An.Size, An.Habitat, An.Sex, An.getEnergyLevel(), An.getAge(), An.getWeight(),"colour" ); //narrowing casting
            System.out.println(bob);
            System.out.println(An);
        }


        else {System.out.println("restart program and try again");}
    }
}
