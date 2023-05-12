import java.util.*;

class fibonacci {
   
    //------------------------------------------//
    
    public static void fibonacci_series (int n)
       {
          System.out.print("0  1 ");
          int a, b, i = 1, c;
          a = 0;
          b = 1;
          // fibonacci series according user last digit prefered
          for (i = 1; i <= n; i++) 
            {   
                c = a + b;
                System.out.print(" "+c+" ");
                a = b;
                b = c;
                //break series
                if ((a + b) >= n) 
                break;    
            }      
        }

    //--------------------------------------------//    
        public static void main(String[] args) {
        int n;
            
            // take input of last digit of fibonacci series
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the last number of series");
            n = input.nextInt();
            // public static int fibonacci_series(int n)
            System.out.println("Your Fibonacci Series = " + fibonacci_series(n));
            
    }
}