//delete an element from an array with the help of Number
//import java.util.Arrays;
import java.util.Scanner;
class Del_1Dprog2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        int pos=arr.length-1,num,temp;
        //Entering Array by the User
        System.out.println("Enter 5 elements in an Array :- ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter number you want to Delete : ");
        num=sc.nextInt();

        for(int i=0;i<arr.length;i++)
        {
            if(num==arr[i])
            {
                temp=arr[i];
                pos=i;
                break;
            }
            else if(i==arr.length-1)
            {
                System.out.print("Number Not Found!!!");
            }
        }
        sc.close();
       
        if(num==arr[pos])
        {
            for(int i=pos+1;i<arr.length;i++)
            {
                arr[i-1]=arr[i];
            }
            //System.out.println(Arrays.toString(arr));  // for cheking "Copying"/Shifting is successful or not               
            
            System.out.println("Printing Array after Deleted Element : ");
            for(int i=0;i<arr.length-1;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}