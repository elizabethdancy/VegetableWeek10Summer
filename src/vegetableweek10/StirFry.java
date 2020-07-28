/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vegetableweek10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * A class that has an ArrayList of vegetables
 * Will determine whether the stirfry tastes good.
 * @author dancye
 */
public class StirFry 
{
  public static void main(String[] args)
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("What kind of vegetable would you like to create?");
      String vegName = sc.nextLine();
      VegetableFactory vegF = new VegetableFactory();
      Vegetable v1 = vegF.createVegetable(vegName);
      //repeat as necessary
      ArrayList<Vegetable> veggies = new ArrayList();
      veggies.add(v1);
      boolean tastesGood = true;
      for(Vegetable v: veggies)
      {
          if(!v.isTasty())
          {
              tastesGood=false;
          }
      }
      System.out.println("Does this stirfry taste good? "+tastesGood);
  }
}
