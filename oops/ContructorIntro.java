package oops;

public class ContructorIntro {

    String name ; 
    int age ;
    double  marks ; 
  ContructorIntro(){ // deafault constructor 
    // this also  need not  to create it defautly create by compliper
    // but variables  valuees will assign difrent dns shows diffrentvalue on calling it 
    // here we are setting defaut value for  variables 
    name = " unknown";// by default it assign as null  
    age = 0 ;// as 0
    marks = 0.0; // as 0.0
  }

  ContructorIntro(String naam , int umar , double number ){// parameetrized constructor 
    //  here we canor cant use this keyword
    // it will gonna use if the parametr variable name is same as the name of instance variable 
    // like naam is write as name in parameter 
    this.name = naam ;
    this.age = umar;
    this.marks = number;
 }

 ContructorIntro (ContructorIntro SameStudent){
    this.name = SameStudent.name;
    this.age = SameStudent.age;
    this.marks= SameStudent.marks;
 }
  
 void display(){//class  method 
    System.out.println("Name is : "+name+   "  Age is :"+age+"   obtined marks is : "+marks);

 }
    
}

 class constructorNeedDemo{
    public static void main(String[] args) {
        System.out.println(" without  using constructor  the mannula work is ");

        ContructorIntro c1 = new ContructorIntro();// autimatically calls the deafult constructor 
        // you can now print to see the default value 
        System.out.println(" the default values are ");
        c1.display();

        // now mannually assigning values withot using cosntructor 
        c1.name = " harshit";
        c1.age= 21 ;
        c1.marks= 99;
        System.out.println(" mannual assigned value are ");
        c1.display();

        System.out.println(" using parametrized constructor for assigning values ");
        ContructorIntro c2 = new ContructorIntro("harshit" , 21 , 99);
        c2.display();

        // suppose we want to add data of two peoples this  is how we ulilize the  use of contructor 
          System.out.println();
        ContructorIntro l =new ContructorIntro( "lavisha " , 22, 50);
        ContructorIntro H =new ContructorIntro( "harshit " , 20 , 100);
        l.display();
        H.display();
        
        
    }
}
