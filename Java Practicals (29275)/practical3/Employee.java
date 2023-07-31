/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical3;

/**
 *
 * @author kavin
 */
public class Employee {
     private String Name;
    private int age;
    private float salary;
    private float bonus=0,bonusAmmount=0;
    
   //Using getter setter method 
/*    public void setName(String Name){
       this.Name=Name;
    }
    public String getName(){
      return Name;
    }
    public void setAge(int age){
      this.age=age;
    }
    public int getAge(){
      return age;
    }
    public void setSalary(float salary){
      this.salary=salary;
    }
    public float getSalary(){
      return salary;
    }
    */
    //using cunstructor method
    /*public Employee(String Name,int age,float salary){
       this.Name=Name;
       this.age=age;
       this.salary=salary;
    }
     public String getName(){
      return Name;
    }
     public int getAge(){
      return age;
    }
    public float getSalary(){
      return salary;
    }
*/
    //ex3.2
    public Employee(float bonus){
      this.bonus=bonus;
    }
     public void setName(String Name){
       this.Name=Name;
    }
    public String getName(){
      return Name;
    }
    public void setAge(int age){
      this.age=age;
    }
    public int getAge(){
      return age;
    }
    public void setSalary(float salary){
      this.salary=salary;
    }
    public float getSalary(){
      return salary;
    }
    
    
    public void displayData(){
        bonusAmmount=bonus+salary;
        System.out.println("Employee Name:"+Name+"\n"
                            +"Basic Salary:"+salary+"\n"
                            +"Bonus:"+bonus+"\n"
                             +"Bonus Ammount:"+bonusAmmount );
                            
    }
}
