package oops;

public class ArgumentPassing {
    // here clearly visible java strictly support call by value on primitive data type 
    public static void increament( int a ,int b){
        a = a+10;
        b = b+20;
    }
    public static void main(String[] args) {
        int x = 20  , y=40;
        System.out.println(" the value before implementing ");
        System.out.println(x+"  "+y);
        increament(x, y);
        System.out.println(" after increament  "+ x +" "+y);// we can see no changes 
        // because  in the memory anther  copy of x and y variable created 
        // with assign with value 20  and 30 same value passes to  and b 
        // and changes occur in the variable a nd b in the  memory notin x and y because both x and y denoting other variable in mempory and a and b diffrenet 
    }
}
