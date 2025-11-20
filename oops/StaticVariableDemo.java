package oops;

public class StaticVariableDemo {
    int a ;// no of  copies created of this variable in the memory as the no of object created for this class 
    static int b;//only one varible space created in the memory in method area of memory 
}

class driverclass{
    public static void main(String[] args) {
        StaticVariableDemo sd = new StaticVariableDemo();// object craetion 
        sd.a = 10;
        StaticVariableDemo sd2 = new StaticVariableDemo();
        StaticVariableDemo sd3 = new StaticVariableDemo();
        sd2.a = 20 ;
        sd3.a= 30 ;// here 3 no ofcopies of acreated in head area wach varible containing there respective value 

        sd.b= 10 ;
        sd2.b=20 ;
        sd3.b=30;
        // here there is no any furthur copy of b is created there so last updated of value of b will gonna 
        // print for all that is 30 
        System.out.println(sd.a+" "+sd2.a+" "+sd3.a);
        System.out.println(sd.b+" "+sd2.b+" "+sd3.b);// all of print 30 but 
        // this is notcorrect way tp print the static variablewe dont print it usuing obj because there is 
        // no relation of the static variable with object but java complier smart enough remove object refrence nad considered as the part of class 
        // the correct method  to print it using class refrence not object refrence 

        System.out.println(StaticVariableDemo.b);// this one is correct way 
    
    }
}
