import java.util.Scanner;
class HolloDiamond
{
    public static void main(String[] args) {
        
        int n,r,s1,s2,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Odd Row Number : ");
        n=sc.nextInt();
        sc.close();
        
        for(s1=1;s1<=n;s1++)
        {
            System.out.print("*");
        }
/*-----------------------------------------------------------------------------------*/
        System.out.println();

        for(r=1;r<=(n/2)-1;r++)             //4 rows if Input is 11
        {
            for(s1=1;s1<=(n+1)/2-r;s1++)     //6-r if Input is 11
            {
                System.out.print("*");
            }

            for(b=1;b<=(2*r)-1;b++)
            {
                System.out.print(" ");
            }

            for(s2=1;s2<=(n+1)/2-r;s2++)      //6-r if Input is 11
            {
                System.out.print("*");
            }
            System.out.println();
        }
/*-----------------------------------------------------------------------------------*/

        for(r=1;r<=n/2;r++)                 //5 rows if Input is 11
        {
            for(s1=1;s1<=r;s1++)
            {
                System.out.print("*");
            }

            for(b=1;b<=n-(2*r);b++)
            {
                System.out.print(" ");
            }

            for(s2=1;s2<=r;s2++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
/*------------------------------------------------------------------------------------*/

        for(s1=1;s1<=n;s1++)
        {
            System.out.print("*");
        }
    }
}