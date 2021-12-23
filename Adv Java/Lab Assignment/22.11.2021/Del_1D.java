//delete an element from an array with the help of Position
import java.util.Arrays;
import java.util.Scanner;
class Del_1D
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int pos,temp;
        int arr[] = new int[5];

        //Entering Array by the User
        System.out.println("Enter 5 elements in an Array :- ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter position you want to Delete : ");
        pos=sc.nextInt();

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==pos)
            {
                temp=arr[i];
            }
        }

        
        for(int i=pos+1;i<arr.length;i++)
        {
            arr[i-1]=arr[i];
        }
        System.out.println(Arrays.toString(arr));  // for cheking "Copying"/Shifting is successful or not
        
        sc.close();

       System.out.println("Printed Array after Deleted Element : ");

        for(int i=0;i<arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}