//Binart To Decimal
import java.util.Scanner;

public class binarytodecimal {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your binary number:");
        int Binary=sc.nextInt();

        int n=0;
         int Decimal=0;
    
    while(Binary>0)
    {
        int last=Binary%10;
        Decimal+=(last*Math.pow(2,n));
        Binary=Binary/10;
        n++;
    }
    System.out.println(Decimal);

    }
    
}
