package oops;

public class Encapsulation { 
    // this variables can only be accesed by this class and method of this class
    private int roll;
   private String name;
   private double per;
  // to modify theses values we have to provide public getter nad setter method for  it 

  public  void setEncapsulation ( int r , String n , double p){
    // this one is called as setter method to setor modifiy thw value 
    if( r<=0) System.out.println(" invalid roll input ");// here it is also advantage of encapsulation 
    // that is there is fixed condition due to method in input by user cant enter anything according to him 
    else 
    roll = r;
 
     name = n ;
    per = p ;
  }

  // getter method for variables
  
  public int  getroll(){
return roll ;
  }

  public void getotherinfos(){
    System.out.println(" name is "+ name );
    System.out.println(" the percentage is "+per);
  }
  
    
}
