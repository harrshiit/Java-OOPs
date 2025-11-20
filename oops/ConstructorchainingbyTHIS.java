package oops;

public class ConstructorchainingbyTHIS {
     private int length , breadth ,height ; 

     // creating constructors 
  public   ConstructorchainingbyTHIS( int length , int breadth ,  int height){
       this(); // this will gonna call those constructor which takes no argument 
        this.length =length ; 
        this.breadth = breadth;
        this.height =height ;
    }

    public ConstructorchainingbyTHIS( int equalsides ){
        
        this(equalsides , equalsides ,equalsides); 
        // while calling the constructor inside another it should also palce on the first line 
        // here this keyword will call those  constructor which accpet the three arguments 
    }

    public ConstructorchainingbyTHIS(){
        System.out.println(" good work now assigning the value of length  breadth and height started ");
    }

    public void volume(){
        System.out.println(" the volumeof cube is  :"+length*breadth*height);
    }
    
}

class Mainclass{
    public static void main(String[] args) {
        ConstructorchainingbyTHIS ob =new ConstructorchainingbyTHIS(2);// passing one argument 

        ob.volume();

         ConstructorchainingbyTHIS ob1 =new ConstructorchainingbyTHIS(2,3 , 4 );
         ob1.volume();


    }
}
