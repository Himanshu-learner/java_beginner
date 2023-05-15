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
                int num1,num2;
                System.out.println("\nEnter your two integer numbers"); 
                System.out.println("Your entered values = " + (num1 = sc.nextInt()) + ", "+ (num2 = sc.nextInt()));
                System.out.println("\nAddition="+ twointeger(num1,num2) ); 
                break;
            
            case 2:
                System.out.println("\nEnter your three integer number");  
                int num3,num4,num5;
                System.out.println("Your entered values = " + (num3 = sc.nextInt()) + ", "+ (num4 = sc.nextInt()) +"and "+ (num5 = sc.nextInt()));
                System.out.println("\nAddition = "+ threeinteger(num3 , num4 , num5 ) );
                break;
            
            case 3:
                System.out.println("\nEnter one integer and one float number");
                int num6;
                double num7;
                System.out.println("Your entered values = " + (num6 = sc.nextInt()) + ", "+ (num7 = sc.nextDouble()));
                System.out.println("\nAddition ="+ multiple(num6,num7));
                break;
            default:
                System.out.println("\nOnly Enter 1,2 or 3");
                break;
        }
        
        System.out.println("\nThanks for visiting\n");
        sc.close();
      
    } 
    
      public static int twointeger(int a,int b) {
        return a+b;
      }

      public static int threeinteger(int a,int b,int c) {
        return a+b+c;
      }
      public static double multiple(int a,double b) {
        return a+b;
      } 
}
    

