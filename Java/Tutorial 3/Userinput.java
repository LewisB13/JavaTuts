//import scanner

import java.util.Scanner;

public class Userinput{
   
   public static void main (String[] args){
      //create the scanner
      Scanner keyin = new Scanner(System.in);
      System.out.println("Hey friend what is your name and i would like to get to know you better ");
      
      // ask for strign input
      String name = keyin.nextLine();
      System.out.println ("hello " + name + "What age are you");
      //int input
      int age = keyin.nextInt();
      
      //double in
      System.out.println("How tall are you in M eg 1.86, 1.20....");
      double height = keyin.nextDouble();
      
      //char in
      System.out.println("Be honest what was your last grade in school A, B, C, D, E, F");
      char grade = keyin.next().charAt(0);
      
      // boolean true or flse
      System.out.println("Are you enjoying java? (TRUE OR FALSE)");
      boolean likesJava = keyin.nextBoolean();
      
      //print all data on screen
      System.out.println("\n\n\nHere is all the information you have told me thank you friend");
      System.out.println("NAME: " + name);
      System.out.println("AGE: " + age);
      System.out.println("HEIGHT : " + height);
      System.out.println("Last Grade: " + grade);
      System.out.println("Do they like java ? " + likesJava);
      
      keyin.close();
   
   
   
   
   }






}