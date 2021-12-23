//Binary Search in java
import java.util.*;
class BinSearch
{
    public static void main(String[] args)
    {
        int arr[] = new int[5];
        int l=0,h=(arr.length-1),flag=0,m;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 elements :-");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Array Sorted :-");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.print("Enter Searching a number : ");
        int num=sc.nextInt();
        sc.close();

        System.out.println("Searching Started");
        while(l<=h)
        {
            m=(l+h)/2;
            
            if(arr[m]==num)
            {
                System.out.print("Number Found at Location "+(m+1));
                flag=1;
                break;
            }
            else if(arr[m]>num)
            {
                h=m-1;
            }
            else
            {
                l=m+1;
            }
        }

        if(flag==0)
        {
            System.out.print("Number Not Found!!!");
        }
        
    }
    
}
