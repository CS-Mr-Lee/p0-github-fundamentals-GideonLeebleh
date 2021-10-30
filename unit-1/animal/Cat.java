
package com.company;

public class Cat extends Animals {

   private String colour;
   private String breed;

   public Cat(String Name, String FavFood, String Size, String Habitat, char Sex, int EnergyLevel, int Age, double Weight, String breed, String colour)
   {
      super(Name, FavFood, Size, Habitat, Sex, EnergyLevel, Age, Weight);
      this.colour = "none";
      this.breed = "none";
   }


   /**
    * eat action
    * @param isMeat determines if what the cat is eating is meat or not
    */
   public void eat(Boolean isMeat)
   {
      if (isMeat == true)
      {
         Meat meat = new Meat("chicken nuggets", "chickeny", true, false, 10);
         System.out.println("The cat enjoys the food and gains 20 energy");
         setEnergyLevel(getEnergyLevel() + 20);
         System.out.println(Name + " gains " + meat.getWeight() + " kg's of weight");
         setWeight(getWeight() + meat.getWeight());
      }

      else if (isMeat == false)
      {
         System.out.println("This is a cat, not a rabbit. Get it some sort of real cat food");
      }

      if (bleed == true)
      {
         System.out.println(Name + " has the bleeding effect and has just lost 10 energy points");
         setEnergyLevel(getEnergyLevel() - 10);
      }
      dead(getEnergyLevel());
   }


   //set and get methods

      /**
       * set and get breed
       * @param breed is the breed of the cat
       */
      public void setBreed(String breed)
      {
         this.breed = breed;
      }
      public String getBreed()
      {
         return breed;
      }

      /**
       *  set and get colour
       * @param colour is the colour of the cat
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