package oops;
public class GetterSetter {
 // here i am demontrationg the example of encapsultion 
  private  String name;  
   private int id ;
  private  double price; 

  public GetterSetter(String name , int id , double rate ){
    // here we are creating the construction so that we canset the  value only once at time at the 
    //  time of creation of object to provide immutability 
    this.name = name ;
    this.id = id ;
    price = rate;
   }
   // if  we want to change the price but did not provide any setter for price and id 
   public void setprice( double daam ){
    price = daam ;
   }
   
   public String getName(){
    return name  ;
   }

   public int getId(){
    return id ;
   }
   public double  getprice(){
    return price;
   }
}

class Main {
    public static void main(String[] args) {
        GetterSetter g  = new GetterSetter("maggi", 10, 12);
        System.out.println(" product details before  updation ");
        System.out.println(g.getName());
        System.out.println(g.getId());
        System.out.println(g.getprice());
        g.setprice(14);// price from 12 14
        System.out.println(" product details after updation "); 
         System.out.println(g.getName());
        System.out.println(g.getId());
        System.out.println(g.getprice());


        
    }
}
