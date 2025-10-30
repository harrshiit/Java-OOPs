package oops;

public class UseEncapsulation {
public static void main(String[] args) {
    Encapsulation e = new Encapsulation();// object created of encapsulation class
    e.setEncapsulation(10, "Harshit ", 99); 
    Encapsulation f = new Encapsulation(); // another one
    f.setEncapsulation(11, "vishesh", 98); 

    System.out.println("the 1st student details ");
    System.out.println(" the roll number  , name and percentage are  roll is : "+e.getroll());
    e.getotherinfos();
    
    System.out.println("the 2nd student details ");
    System.out.println(" the roll number  , name and percentage are roll is  "+f.getroll());
    f.getotherinfos();
}

    
}
