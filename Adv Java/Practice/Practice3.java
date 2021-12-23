import java.util.Scanner;

public class Practice3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int x=sc.nextInt();
        double y=sc.nextDouble();
        if(x>y)
        {
            System.out.print(String.format("%.2f",y);
            
        }
        else if(x%5==0)
        {
            System.out.println(String.format("%.2f",(y-0.50)-x));
        }
        else if(x%5!=0)
        {
            System.out.println(String.format("%.2f",y));
        }
        sc.close();
    }
}
