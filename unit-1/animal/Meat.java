package com.company;

public class Meat {

    //attributes

    private String type;
    private String taste;
    private boolean isPreped;
    private boolean hasBones;
    private double boneWeight;
    private double weight;


    //default

    public Meat(String type, String taste, boolean isPrepped, boolean hasBones, double weight)
    {
        this.type = type;
        this.taste = taste;
        this.isPreped = isPreped;
        this.boneWeight = boneWeight;
        this.weight = weight;
        this.hasBones = hasBones;

        if(boneWeight >=0)
        {
            this.hasBones = true;
        }

    }

    //get methods

    public String getType() {return type;}

    public String getTaste() {return taste;}

    public boolean getIsPrepped() {return isPreped;}

    public boolean getHasBones() {return hasBones;}

    public double getBoneWeight() {return boneWeight;}

    public double getWeight() {return weight;}


}