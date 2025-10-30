package oops;

abstract class Abstraction1 {
    //here implementing abstraction using abstract class 
    abstract void start(); // abstract methos we cant define it in abstract class

    void stop(){
        // normal or concete method we can define its body here
        System.out.println(" vehicle  has stopped ");
          }
 }

 // creating subclassess
  
 class car extends Abstraction1{
    void start(){
        // here we  are definig the  abstract method 
        System.out.println(" carstart with key ignition ");

    }
 }

 class bike extends Abstraction1{
    void start(){
        System.out.println(" bike start with  self button");
    }
 }
    

