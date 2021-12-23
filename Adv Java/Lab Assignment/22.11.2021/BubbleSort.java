//Bubble Sort in java
import java.util.Scanner;

class BubbleSort 
{
    public static void main(String[] args) 
    {
        int arr[] = new int[5];
        int n,temp;
        n=arr.length;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 elements : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();

        for(int i=1;i<n;i++)                //4 Times
        {
            for(int j=0;j<=(n-i-1);j++)     //4, 3, 2, 1 Times
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println("Printing Sorted Array : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
