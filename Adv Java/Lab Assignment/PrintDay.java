import java.util.Scanner;

class PrintDay 
{
    public static void main(String[] args)
    {
        double Year;
        int PrintYear;
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
                    PrintYear = (int)Year + 28;
                    System.out.println("This is a Leap Year - "+PrintYear);
                }
                else
                {
                    System.out.println("Not a Leap Year");
                }
            }
            else
            {
                PrintYear = (int)Year + 28;
                System.out.println("This is a Leap Year - "+PrintYear);
            }
        }
        else
        {
            System.out.println("Not a Leap Year");
        }
    }   
}

