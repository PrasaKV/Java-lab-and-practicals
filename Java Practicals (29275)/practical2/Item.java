/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical2;

/**
 *
 * @author kavin
 */
public class Item {
        private int location;
    private  String description;
    //2.	Add a constructor method for the Item class that takes an integer and a String as arguments (in that order). 
    public Item(int location,String description){//create cunstructor method
       //The constructor should assign the value of these parameters to the corresponding instance variables. 
       this.location=location;
       this.description=description;
    }
    //Add getter and setter methods for the location and description variables. 
    //Setter method to Location
    public void setLocation(int location){
        this.location=location;
    }
    //getter method to location
    public int getLocation(){
       return location;
    }
    //setter method to Description
    public void setDescription(String description){
      this.description=description;
    }
    //getter method to Description
    public String getDescription(){
      return description;
    }
}
