import java.util.Scanner;
class Diamond
{
    public static void main(String[] args) {
        
        int n,r,s,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Odd Row Number : ");
        n=sc.nextInt();
        sc.close();

        for(r=1;r<=n/2;r++)
        {
            for(b=1;b<=(n+1)/2-r;b++)
            {
                System.out.print(" ");
            }

            for(s=1;s<=2*r-1;s++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
/*-----------------------------------------------------------------------------------*/

        for(r=1;r<=(n+1)/2;r++)
        {
            for(b=1;b<=r-1;b++)
            {
                System.out.print(" ");
            }

            for(s=1;s<=(n+2)-(2*r);s++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}