
package oops;

import java.util.*;
public class Staticblock3 {
    private String name ;
    private double balance ;
    private static double rate_of_interest ;  
    // here we want to assign the rate of interest only once also have to take value by user 
   static{// supoose we want to take input from the user about the rate of interest that input will taken only once 
    System.out.println(" enter the rate of interest ");
    Scanner sc = new Scanner(System.in);
    rate_of_interest = sc.nextDouble()/100; // here we are converting the rate of interest into decimal 
    // here we can inilize the value of static variablr inside the static block 

   }
 Staticblock3( String name , double balance){
  this.name = name ; 
  this.balance = balance;
 }
 public void display(){
  double afterbalance = balance*(1+rate_of_interest);
  System.out.println("The final amount of Rs. "+ balance+" of "+name+" is "+afterbalance);
 }
}

 class driverClass{
  public static void main(String[] args) {
    Staticblock3 obj1 = new Staticblock3("Harshit" , 1000000);
    // we are creating the class object where the static block exist means class become in use so firstly static block is called and 
    // gonna ask for entering rate of interest but it runs only one times 
    obj1.display();
    Staticblock3 obj2 = new Staticblock3("Harsh" , 500000);
    obj2.display();

    
  }
 }
