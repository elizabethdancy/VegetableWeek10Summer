/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vegetableweek10;

/**
 *
 * @author dancye
 */
public class Broccoli extends Vegetable
{
    public Broccoli()
    {
        super("Broccoli", "green");
            
    }
    
    @Override
    public boolean isTasty()
    {
        return true;
    }
}
