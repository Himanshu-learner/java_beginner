//----------------------AREA CALCULATOR-------------------------//

import java.util.*;

//Base Class
class shape{
    
    public int length,breath;

    public void data(){
    
    //Input through user
    System.out.println("\nEnter your length and breath of calculating area");
    Scanner sc = new Scanner(System.in);
    length = sc.nextInt();
    breath = sc.nextInt();

    //Input of user show
    System.out.println("Your entered values = " + length +", "+breath);
         
    }   
    
    //Area Method
    public void disp_area() {
       
        System.out.println("Your area = "+ (length*breath));
        
    }
}

//Triangle Derived Class
class Triangle extends shape{

    public void disp_area(){
        System.out.println("\nTriangle area = "+(0.5*length*breath));
    }
}

//Rectangle Derived Class
class Rectangle extends shape{
    
    public  void disp_area(){
        System.out.println("\nRectangle area = "+(length*breath));
        
    }
}

//Main Method Class
public class area{
    public static void main(String[] args) {
        
        Triangle triangle = new Triangle();
        System.out.println("\nTRIANGLE AREA");
        triangle.data();
        triangle.disp_area();
        
        Rectangle rectangle= new Rectangle();
        System.out.println("\nRectangle AREA");
        rectangle.data();
        rectangle.disp_area();
 
        
    }
}