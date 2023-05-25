import java.util.*;

class shape{
    
    public int length,breath;

    public void data(){
    
    System.out.println("\nEnter your length and breath of calculating area");
    Scanner sc = new Scanner(System.in);
    length = sc.nextInt();
    breath = sc.nextInt();
    System.out.println("Your entered values = " + length +", "+breath);
         
    }   
    
    public void disp_area() {
       
        System.out.println("Your area = "+ (length*breath));
        
    }
}

class Triangle extends shape{

    public void disp_area(){
        System.out.println("\nTriangle area = "+(0.5*length*breath));
    }
}

class Rectangle extends shape{
    
    public  void disp_area(){
        System.out.println("\nRectangle area = "+(length*breath));
        
    }
}
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