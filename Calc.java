//simple calculator
import java.util.Scanner;

public class Calc
{
    
    public static void main(String args[])
    {
        double num1 , num2 , result;
        char operator;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your first integer:");
        num1=sc.nextDouble();
        
        System.out.println("Enter your Second Number:");
        num2=sc.nextDouble();

        System.out.println("Enter your prefered operator(+,-,*,/):");
        operator = sc.next().charAt(0);

        if(operator == '+')
        {
            System.out.println("Addition of your number:");
            result =num1+num2 ;
        }
        else if(operator == '-')
        {
            System.out.println("Subraction of your number:");
            result=num1-num2;
        }        
        else if(operator=='*')
        {
            System.out.println("Multiplication of your number:");
            result=num1*num2;
        }
        else if(operator=='/')
        {
            System.out.println("Division of your number:");
            if(num2!=0)
            {
                result=num1/num2;
            }
            else
            {
                System.out.println("Division of 0 is not possible");
                return;
            }
            
        }
        else
        {
            System.out.println("Invalid operator");
            return;
        }
        System.out.println(result);

    }
    
}