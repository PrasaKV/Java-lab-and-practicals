/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical2;

/**
 *
 * @author kavin
 */
public class Monster extends Item{
    //Add a constructor method to the Monster class that takes an integer and a String argument just like the Item class constructor. 
    public Monster(int location, String description) {
    //Use these arguments to call the Item super class constructor from within the Monster class constructor so that the instance variables in the superclass are instantiated correctly.  
        super(location, description);
    }
    
}
