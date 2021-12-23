//Count Leap Years in b/w random 2 Years
import java.util.Scanner;

class PrintLeapYear 
{
    public static void main(String[] args)
    {
        double Year1,Year2,i,ct=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Year : ");
        Year1=sc.nextInt();
        System.out.print("Enter 2nd Year : ");
        Year2=sc.nextInt();
        sc.close();
        for(i=Year1;i<=Year2;i++)
        { 
            if(i%4==0)
            {
                if(i%100==0)
                {
                    if(i%400==0)
                    {
                        ct++;
                    }
                    else
                    {
                        //System.out.println("Not Leap Year");
                    }
                }
                else
                {
                    ct++;
                }
            }
            else
            {
                //System.out.println("Not Leap Year");
            }
        }
        System.out.println(ct);
    }   
}
