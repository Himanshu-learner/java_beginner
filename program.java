import java.util.*;

class calculation{
 public static void main(String[] ar) {
       
    int n;
    double principal,time,rate,sinterest,hinterest,binterest;   
    System.out.println("\nENTER YOUR PRINCIPAL TIME AND RATE");

    Scanner sc = new Scanner(System.in);
        principal = sc.nextDouble();
        time = sc.nextDouble();
        rate = sc.nextDouble();

        // Principal , time and rate entered through user
        System.out.println("\nENTER YOUR PRINCIPAL = "+principal +" TIME = "+time +" AND RATE = "+rate+"%");

        // Preferred bank which mentioned
        System.out.println("\nWhich bank interest calculator you want?");
        System.out.print("\n1.SBI \n2.HDFC \n3.BOB\n");
            
        n = sc.nextInt();

        //SBI
       if (n==1) {
        sinterest=(principal*rate*time)/100;
        System.out.println("\nSBI INTEREST : "+ sinterest);
        System.out.println("\nTotal = Principal + Interest \nTotal = "+(principal+sinterest));
       }

       //HDFC
       else if (n==2) {
        hinterest=(principal*rate*time)/100;
        System.out.println("\nHDFC INTEREST : "+ hinterest);
        System.out.println("\nTotal = Principal + Interest \nTotal = "+(principal+hinterest));
       }
       
       //BOB
       else if (n==3) {
        binterest=(principal*rate*time)/100;
        System.out.println("\nBOB INTEREST : "+ binterest);
        System.out.println("\nTotal = Principal + Interest \nTotal = "+(principal+binterest));
       }

       //WRONG INPUT
       else{
        System.out.println("\nPlease! Choose only mentioned number");
       }  
}
}