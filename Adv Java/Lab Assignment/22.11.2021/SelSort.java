//Selection Sort in java
import java.util.Scanner;
class SelSort 
{
    public static void main(String[] args) 
    {
        int arr[]=new int[5];
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();

        for(int i=0;i<arr.length;i++)           // 5 Times
        {
            for(int j=i+1;j<arr.length;j++)     //4 Times
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.print("Printng Sorted Array : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}