public class practical {
   public static void main(String[] args) {
      // Q1 
       System.out.println("Hello World");
      
      //Q2
        
        System.out.println("My name is kavindu");
        System.out.println("I am Undergradujate Software Engineer");
       
      // Q3
      
        System.out.println("Executing loop 0");
        System.out.println("Executing loop 1");
        System.out.println("Executing loop 2");
        System.out.println("Executing loop 3");
        System.out.println("Executing loop 4");
        
        System.out.println("Executing loop 5"+"\n"+"Executing loop 6");
        
        System.out.println("********Using for loop********");
        for(int i=0;i<5;i++){
        System.out.println("Executing loop"+i);
       

      // Q4

      
        int[] numbers = { 10, 20, 30, 40, 50 };
        for (int x : numbers) {
        if (x == 30) {
        break;
        }
        System.out.print(x);
        System.out.print("\n");
        }
        System.out.print("i am out of the loop now");
        
        // output---
        // 30
        // I’m out of the Loop now
       

      
        //int [] numbers = {10, 20, 30, 40, 50};
        for(int x : numbers ){
        if( x == 30 ){
        continue;
        }
        System.out.print( x );
        System.out.print("\n");
        }
        
        System.out.print("i am out of the loop now");
       
      // output 10 20 40 50
      // not print 30 beacause when compiler came to x==30 there are continue statment
      // .compiler goto stating point of code without going System.out.print( x )
      // method.

      // Q5

      char grade = 'A';
      switch (grade) {
         case 'A':
            System.out.println("Excellent");
            break;
         case 'D':
            System.out.println("YOu Passed");
            // break;
         case 'F':
            System.out.println("Better try again");
            break;
         default:
            System.out.println("Invalid grade");
      }
      System.out.println("Your Grad is " + grade);

      // in this code case 'D' doesn't have break statment .Beacause of that compliler
      // go to next caswe and print it.when the next case have a break statament
      // compiler shoud stop.
      // output
      // YOu Passed
      // Better try again
      // Your Grad is D

      // after remove case 'A' break statment
      grade = 'A';
      switch (grade) {
         case 'A':
            System.out.println("Excellent");
            // break;
         case 'D':
            System.out.println("YOu Passed");
            // break;
         case 'F':
            System.out.println("Better try again");
            break;
         default:
            System.out.println("Invalid grade");
      }
      System.out.println("Your Grad is " + grade);

      /*
       * Excellent
       * YOu Passed
       * Better try again
       * Your Grad is A
       */

      // Q6
      int[] numbersN= { 10, 20, 30, 40, 50 };
      for (int x : numbersN) {
         System.out.print(x);
         System.out.print(",");
      }
      System.out.print("\n");
      String[] names = { "James", "Larry", "Tom", "Lacy" };
      for (String name : names) {
         System.out.print(name);
         System.out.print(",");
      }
      
       //10,20,30,40,50,
       /*James,Larry,Tom,Lacy*/
       

   }

}
}