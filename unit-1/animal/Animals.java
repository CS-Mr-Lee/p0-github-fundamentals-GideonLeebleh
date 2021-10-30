/*
 *   Creator: Gideon Lee
 *   Program: Animals
 *   What it does: It allows the user to make a custom moose cat or cow,
 *                 and let said animal go through multiple different
 *                 actions.
 *
 *   Please note: This program was based of my original moose program,
 *                and I'm not going to lie is probably a bit scuffed.
 *                If anything wrong is found with this program please
 *                notify me, so I can fix it. Will update comments more
 *                later, but really busy with other school stuff.
 *
 *  Also: I got the third animal (the cow) from Kieran Lee.
 */
package com.company;
import javax.swing.text.StyledEditorKit;


public class Animals {

    //attributes

    //attribute var
    String Name;
    String FavFood;
    String Size;
    String Habitat;
    char Sex;
    private int EnergyLevel;
    private int Age;
    private double Weight;

    //bleed effect variables
    int heal;
    boolean bleed = false;


    public Animals()
    {
        this.Name = "none";
        this.FavFood = "none";
        this.Size = "none";
        this.Habitat = "homeless";
        this.Sex = 'n';
        this.EnergyLevel = 50;
        this.Age = 0;
        this.Weight = 0;
    }

    public Animals(String Name, String FavFood, String Size, String Habitat, char Sex, int EnergyLevel, int Age, double Weight)
    {
        this.Name = Name;
        this.FavFood = FavFood;
        this.Size = Size;
        this.Habitat = Habitat;
        this.Sex = Sex;
        this.EnergyLevel = EnergyLevel;
        this.Age = Age;
        this.Weight = Weight;
    }


    //actions

    /**
     * sleep action
     * @param nap how long the moose will sleep for
     */
    public void sleep(int nap)
    {
        EnergyLevel = EnergyLevel + nap;
        System.out.println(Name + " has gained " + nap + " energy points");

        if (bleed == true)
        {
            heal = heal + nap;

            if (heal >= 24)
            {
                bleed = false;
                System.out.println(Name + " is not bleeding out anymore, hooray");
                heal = 0;
            }
        }
        dead(getEnergyLevel());
    }

    /**
     * fight action
     * @param outcome whether there is a fight or not
     */
    public void fight(boolean outcome)
    {
        if (outcome == true)
        {
            System.out.println(Name + " is fighting a something or other!");
            double rand = Math.random() * 9 + 1;
            if (rand > 5)
            {
                System.out.println(Name + " wins the fight and gains 10 energy points");
                EnergyLevel = EnergyLevel + 10;

                if (bleed == true)
                {
                    System.out.println(Name + " has the bleeding effect and has just lost 10 energy points");
                    EnergyLevel = EnergyLevel - 10;
                }
            }
            else if (rand <= 5)
            {
                System.out.println(Name + " loses the fight and loses 10 energy points");
                EnergyLevel = EnergyLevel - 10;
                double rand2 = Math.floor(Math.random() * (2 - 1 + 1) + 1);
                if (rand2 > 1 && bleed == false)
                {
                    System.out.println(); //space
                    System.out.println(Name + " is now a " + Name + " that's bleeding out");
                    System.out.println(Name + " now has the bleeding effect, sleep for 24 hours to heal");
                    bleed = true;
                    EnergyLevel = EnergyLevel - 10;
                    System.out.println(Name + " has the bleeding effect and has just lost 10 energy points");
                }
                else if(bleed == true)
                {
                    System.out.println(Name + " has the bleeding effect and has just lost 10 energy points");
                    EnergyLevel = EnergyLevel - 10;
                }
            }
            dead(getEnergyLevel());
        }

        else if (outcome == false)
        {
            System.out.println(Name + " does not get into a fight");
        }
    }

    /**
     * run action
     * @param distance the distance the moose runs
     * @param time  the amount of time the moose runs for
     */
    public void run(int distance, int time)
    {
        double speed = distance/time;
        System.out.println(Name + " runs at a speed of " + speed + " for " + distance + "km and " + time + " hours");
        System.out.println(Name + " loses " + distance + " energy points");
        EnergyLevel = EnergyLevel - distance;

        if (bleed == true)
        {
            System.out.println(Name + " has the bleeding effect and has just lost 10 energy points");
            EnergyLevel = EnergyLevel - 10;
        }
        dead(getEnergyLevel());
    }

    /**
     * eat action
     * @param isMeat determines if what the moose is eating is meat or not
     */
    public void eat(Boolean isMeat)
    {
        if (isMeat == true)
        {
            System.out.println("Moose don't eat meat, learn to feed your moose better");
        }

        else if (isMeat == false)
        {
            Vegetables veg = new Vegetables("leaves", "green", "meh", 10);
            System.out.println("The moose enjoys the food and gains 20 energy");
            EnergyLevel = EnergyLevel + 20;
            System.out.println(Name + " gains " + veg.getWeight() + " kg's of weight");
            setWeight(getWeight() + veg.getWeight());
        }

        if (bleed == true)
        {
            System.out.println(Name + " has the bleeding effect and has just lost 10 energy points");
            EnergyLevel = EnergyLevel - 10;
        }
        dead(getEnergyLevel());
    }

    /**
     * poo action
     * @param poo the amount of poop unloaded
     */
    public void poo(int poo)
    {
        setWeight(getWeight() - poo);
        System.out.println(Name + " has just dropped " + poo + " kg's of weight");

        if (bleed == true)
        {
            System.out.println(Name + " has the bleeding effect and has just lost 10 energy points");
            EnergyLevel = EnergyLevel - 10;
        }
        dead(getEnergyLevel());
        dead2(getWeight());
    }


    //get and set methods

    public void setAge(int age)
    {
        if (age >= -1)
        {
            this.Age = age;
        }

        else if (age <= -1)
        {
        }
    }

    public int getAge()
    {
        return Age;
    }


    public void setWeight(double weight)
    {
        if (weight >= -1)
        {
            this.Weight = weight;
        }

        else if (weight <= -1)
        {
            this.Weight = weight;
        }
    }

    public double getWeight()
    {
        return Weight;
    }


    public void setEnergyLevel(int energyLevel)
    {
        if (energyLevel >= -1)
        {
            this.EnergyLevel = energyLevel;
        }

        else if (energyLevel <= -1)
        {
        }
    }

    public int getEnergyLevel()
    {
        return EnergyLevel;
    }


    //kill the moose methods

    /**
     * killing the moose through loss of energy
     * @param energy energy level of the moose
     */

    public void dead(int energy)
    {
        if (energy <= 0)
        {
            Name = "none";
            FavFood = "none";
            Size = "none";
            Habitat = "homeless";
            Sex = 'n';
            EnergyLevel = 50;
            Age = 0;
            Weight = 0;

            bleed = false;
            heal = 0;

            System.out.println();
            System.out.println("Your animal has died, default settings are now in place");
        }
    }

    /**
     * kills the moose by lack of weight
     * @param weight what it sounds like
     */
    public void dead2(double weight)
    {
        if (weight <= 0)
        {
            Name = "none";
            FavFood = "none";
            Size = "none";
            Habitat = "homeless";
            Sex = 'n';
            EnergyLevel = 50;
            Age = 0;
            Weight = 0;

            bleed = false;
            heal = 0;

            System.out.println();
            System.out.println("Your animal has died, default settings are now in place");

        }
    }
}
