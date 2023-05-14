import java.util.*;
class adder {
public static void main(String[] args)
    {        
        System.out.println("\nEnter your choise \n\n1.Add two integer\n2.Add three integer\n3.One integer-One float\n");
        System.out.println("Input index number");
        
        Scanner sc = new Scanner(System.in);
            int  n = sc.nextInt();
            
        switch (n) 
        {
            case 1:
                System.out.println("\nEnter your two integer numbers");
                int num1 = sc.nextInt(); 
                int num2 = sc.nextInt(); 
                System.out.println("\nAddition="+ twointeger(num1,num2) ); 
                break;
            
            case 2:
                System.out.println("\nEnter your three integer number");  
                int num3 = sc.nextInt();
                int num4 = sc.nextInt();
                int num5 = sc.nextInt();
                System.out.println("\nAddition = "+ threeinteger(num3 , num4 , num5 ) );
                break;
            
            case 3:
                System.out.println("\nEnter one integer and one float number");
                int num6 = sc.nextInt();
                int num7 = sc.nextInt();
                System.out.println("\nAddition ="+ multiple(num6,num7));
                break;
            default:
                System.out.println("\nOny Enter 1,2 or 3");
                break;
        }
        
        System.out.println("\nThanks for visiting\n");
        sc.close();
      
    } 
    
      public static int twointeger(int a,int b) {
        return a+b;
      }

      public static int threeinteger(int a,int b,int c) {
        return a+b;
      }
      public static double multiple(int a,float b) {
        return a+b;
      } 
}
    

