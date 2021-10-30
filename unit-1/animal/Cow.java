package com.company;

public class Cow extends Animals{

    private String colour;

    public Cow(String Name, String FavFood, String Size, String Habitat, char Sex, int EnergyLevel, int Age, double Weight, String colour)
    {
        super(Name, FavFood, Size, Habitat, Sex, EnergyLevel, Age, Weight);
        this.colour = "none";
    }

    /**
     * The cow moo's
     */
    public void moo()
    {
        System.out.println("MOOOOO goes " + Name + "!");
        System.out.println("The cow gains 5 energy");
        setEnergyLevel(getEnergyLevel() + 5);
    }

    /**
     * eat action
     * @param isMeat determines if what the cow is eating is meat or not
     */
    public void eat(Boolean isMeat)
    {
        if (isMeat == true)
        {
            System.out.println("Cows don't like meat, not even steak for some reason. Feed your cow something else");
        }

        else if (isMeat == false)
        {
            Vegetables veg = new Vegetables("leaves", "green", "meh", 10);
            System.out.println("The cow enjoys the food and gains 20 energy");
            setEnergyLevel(getEnergyLevel() + 20);
            System.out.println(Name + " gains " + veg.getWeight() + " kg's of weight");
            setWeight(getWeight() + veg.getWeight());
        }
    }


    /**
     *  set and get colour
     * @param colour is the colour of the cow
     */
    public void setColour(String colour)
    {
        this.colour = colour;
    }
    public String getColour()
    {
        return colour;
    }
}