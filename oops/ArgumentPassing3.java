package oops;

import java.util.ArrayList;

public class ArgumentPassing3 {
    // here in this code we are going to  demontrate the how the call by refrence
    // work on object ref , array , arrayist and it support call by refrence 
    public static void modify( int [] arr){
        arr[0]+=10;
        arr[1]+=20;
    }

    public static void modifylist(ArrayList<Integer> list){
        list.set(0, list.get(0)+10);//modify the first 
         list.set(1, list.get(1)+20);
         list.add(100); // add now element at next index
    }


    public static void main(String[] args) {

        // demontration for array 
        int [] num = { 2 , 3};
         System.out.println(" before modification  "+num[0]+" "+num[1] );
         modify(num);//here callby refrence works and value gets changed 
          System.out.println(" after modification  "+num[0]+" "+num[1] );

          // for arraylist 

          ArrayList<Integer> al= new ArrayList<>();
          al.add(10);
          al.add(20);
          System.out.println(" before arraylist modidification "+ al);
          modifylist(al);
          System.out.println("after arraylist modification"+al);
    }
   
 
}
