import java.util.Scanner;

public class FoodChecker{

   public static void main (String[] args){
   
   //create scanner
   Scanner keyin = new Scanner(System.in);
   
   //ask user questions
   System.out.println("do you prefer pizza or broccoli? ");
   //stroe user input inside food variable
   String food = keyin.nextLine();
   
   //check if user entered pizza
   if (food.equals("pizza")) {
      System.out.println ("Very good choice my Italian Friends" );
      }
      
   if  (food.equals("broccoli")){
   System.out.println("INTERESTING HMMMMM HEALTHY PERSON DETECTED EWWWWWW");
   }
   
   System.out.println("THANKS FOR USING THE MOST USELESS FOOD CHECKER EVER");
   
   keyin.close();
   
   }


}