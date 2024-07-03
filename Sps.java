import java.util.Random;
import java.util.Scanner;

public class Sps
{
    public static void main(String args[])
    {
        
       Random rand=new Random();
       //Information about the Game

       System.out.println("0 == Stone");
       System.out.println("1 == Paper");
       System.out.println("2 == Scissor");
       
       
       System.out.println("computer chossed it choice, It's your turn");
       int comp = rand.nextInt(3);

       Scanner sc= new Scanner(System.in);
       System.out.println("Enter your choice: " );
       int Guess = sc.nextInt();
      
       if(Guess==0 && comp==2 || Guess==1 && comp==0 || Guess==2 && comp==1)
        {
            System.out.println("Hurry!,You are the winner of this match ");
           
        }
        else if (Guess==0 && comp==0 || Guess==1 && comp==1 || Guess==2 && comp==2) 
        {
            System.out.println("Draw");
        }
        else 
        {
            System.out.println("Oh no!, Yu loss the Game , don't worry");
        }
       
        System.out.print("Computer choice = ");
        System.out.println(comp);
        
    }
}
