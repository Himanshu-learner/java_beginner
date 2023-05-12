import java.util.*;

class calculation{
 public static void main(String[] ar) {
       
    int n;
    double principal,time,rate,sinterest,hinterest,binterest;   
    System.out.println("ENTER YOUR PRINCIPAL TIME AND RATE ");

    Scanner sc = new Scanner(System.in);
        principal = sc.nextDouble();
        time = sc.nextDouble();
        rate = sc.nextDouble();

        System.out.println("ENTER YOUR PRINCIPAL ="+principal +"TIME="+time +" AND RATE=%"+rate);

        System.out.println("Which bank interest calculator you want?");
        System.out.print("1.SBI \n2.HDFC \n3.BOB\n");
            
        n = sc.nextInt();

       if (n==1) {
        sinterest=(principal*rate*time)/100;
        System.out.println("SBI INTEREST : "+ sinterest);
        System.out.println("Total = Principal + Interest \n"+(principal+sinterest));
       }

       else if (n==2) {
        hinterest=(principal*rate*time)/100;
        System.out.println("HDFC INTEREST : "+ hinterest);
        System.out.println("Total = Principal + Interest \n"+(principal+hinterest));
       }

       else if (n==3) {
        binterest=(principal*rate*time)/100;
        System.out.println("BOB INTEREST : "+ binterest);
        System.out.println("Total = Principal + Interest \n"+(principal+binterest));
       }

       else{
        System.out.println("Please! Choose only mentioned number");
       }
      sc.close();  
}
}