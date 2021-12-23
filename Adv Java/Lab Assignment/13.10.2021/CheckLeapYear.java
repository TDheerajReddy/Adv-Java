//Check Leap Year or Not
import java.util.Scanner;

class CheckLeapYear 
{
    public static void main(String[] args)
    {
        double Year;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Year : ");
        Year=sc.nextInt();
        sc.close();
        if(Year%4==0)
        {
            if(Year%100==0)
            {
                if(Year%400==0)
                {
                    System.out.println("This is a Leap Year");
                }
                else
                {
                    System.out.println("Not a Leap Year");
                }
            }
            else
            {
                System.out.println("This is a Leap Year");
            }
        }
        else
        {
            System.out.println("Not a Leap Year");
        }
    }   
}
