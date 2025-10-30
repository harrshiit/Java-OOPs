package oops;

class value{
    int a , b ;
}

public class ArgumentPassing2 {
    // here in this code we demontrating how we can implement call by refrence work  in java 
    public static void modify(value v){
        v.a=v.a+10;
        v.b=v.b+10;
    }

    

    public static void main(String[] args) {
        value v = new value();
        int x, y ;
        x=10;
        y=20;
        v.a=x; //  assign the values to objeect variable 
        v.b=y;
        System.out.println(" before modify ");
        System.out.println(x+"  "+ y); // also use v.a or  v.b 
        modify(v);//  pass object refrence to method 
        System.out.println(" after modify ");
        System.out.printf("%d  , %d|\n",v.a , v.b);
        // here we cant directly use x and y variable to print first we have to assign the value  of  v.a and v.b to x and y after modification
    }
}
