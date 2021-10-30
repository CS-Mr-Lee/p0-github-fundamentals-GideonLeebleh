package com.company;

public class Vegetables {

    //attributes
    private String name;
    private String colour;
    private String taste;
    private double weight;

    //default

    public Vegetables (String name, String colour, String taste, double weight)
    {
        this.name = name;
        this.colour = colour;
        this.taste = taste;
        this.weight = weight;
    }


    //get methods

    public String getName() {return name;}

    public String getColour() {return colour;}

    public String getTaste() {return taste;}

    public double getWeight() {return  weight;}

}
