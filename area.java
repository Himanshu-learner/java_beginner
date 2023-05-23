import java.util.*;

class shape{
    
    public int length,breath;

    public void data(){
    
    System.out.println("Enter your two data");
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
        System.out.println("Triangle area = "+(0.5*length*breath));
    }
}

class Rectangle extends shape{
    
    public  void disp_area(){
        System.out.println("Rectangle area = "+(length*breath));
        
    }
}
public class area{
    public static void main(String[] args) {
        
        Triangle triangle = new Triangle();
        System.out.println("TRIANGLE");
        triangle.data();
        triangle.disp_area();
        
        Rectangle rectangle= new Rectangle();
        System.out.println("Rectangle");
        rectangle.data();
        rectangle.disp_area();
 
        
    }
}