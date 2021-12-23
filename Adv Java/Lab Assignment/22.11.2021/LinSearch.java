//Linear Search in java
import java.util.Scanner;

class LinSearch
{
    public static void main(String[] args)
    {
        int arr[] = new int[5];
        int num, loc=-1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements :-");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter Searching a number : ");
        num=sc.nextInt();

        sc.close();

        for(int i=0;i<arr.length;i++)
        {
            if(num==arr[i])
            {
                loc=i;
                break;
            }
        }

        if(loc== -1)
        {
            System.out.println("Number Not Found!!!");
        }
        else
        {
            System.out.println("Number Found at Location "+(loc+1));
        }
    }
}
