/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vegetableweek10;

/**
 * Example vegetable factory showing the creation of
 * each child class
 * @author dancye, 2020
 */
public class VegetableFactory 
{
    public Vegetable createVegetable(String name)
    {
      Vegetable vegetable = null;
      if(name.equals("Carrot"))
      {
          vegetable = new Carrot();
      }
      else if(name.equals("Asparagus"))
      {
          vegetable = new Asparagus();
      }
      else if(name.equals("Broccoli"))
      {
          vegetable = new Broccoli();
      }
      else if (name.equals("Onion"))
      {
          vegetable = new Onion(100);
      }
      return vegetable;
    }
}
