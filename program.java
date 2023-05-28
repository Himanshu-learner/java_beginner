import java.util.*;

class calculation{
    public static  double rate;
 public static void main(String[] ar) {
     
     
    int n;
    double principal,time,sinterest,hinterest,binterest;   
    System.out.println("\nEnter your  PRINCIPAL and TIME");

    Scanner sc = new Scanner(System.in);
        principal = sc.nextDouble();
        time = sc.nextDouble();

        // Principal and rate entered through user
        System.out.println("\nYOUR ENTERED PRINCIPAL = "+principal+"₹"+" TIME = "+time+"year");

        // Preferred bank which mentioned
        System.out.println("\nWhich bank interest calculator you want?");
        System.out.print("1.SBI \n2.HDFC \n3.BOB\n");
            
        n = sc.nextInt();

        //SBI
       if (n==1) {
        rate = 8.3;
        sinterest=(principal*rate*time)/100;
        System.out.println("\nSBI INTEREST : "+ sinterest+" on Rate : "+rate+"%");
        System.out.printf("\nTotal = Principal("+principal+") " + "+ Interest("+sinterest+")" +"\nTotal = "+(principal+sinterest));
       }

       //HDFC
       else if (n==2) {
        rate = 11.5;
        hinterest=(principal*rate*time)/100;
        System.out.println("\nHDFC INTEREST : "+ hinterest+" on Rate : "+rate+"%");
        System.out.println("\nTotal = Principal("+principal+") " + "+ Interest("+hinterest+")" +"\nTotal = "+(principal+hinterest));
       }
       
       //BOB
       else if (n==3) {
        rate = 9.5;
        binterest=(principal*rate*time)/100;
        System.out.println("\nBOB INTEREST : "+ binterest+" on Rate : "+rate+"%");
        System.out.println("\nTotal = Principal("+principal+") " + "+ Interest("+binterest+")" +"\nTotal = "+(principal+binterest));
       }

       //WRONG INPUT
       else{
        System.out.println("\nPlease! Choose only mentioned number");

        sc.close();

       }  
}
}