//Insert a Element i an Array in java

//import java.util.Arrays;
import java.util.Scanner;
class Ins_1D
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int pos,num,n;
        int arr1[] = new int[5];
        //Entering Array by the User
        System.out.println("Enter 5 elements :- ");
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }

        n=arr1.length;
        int arr2[] = new int[n+1];
        for(int i=0;i<n;i++)
        {
            arr2[i]=arr1[i];            //Copying old Array to New Array
        }

        System.out.print("Enter position you want to insert : ");
        pos=sc.nextInt();
        for(int i=pos;i<n;i++)
        {
            arr2[i+1]=arr1[i];          //"Copying"/Shifting elements to index+1
        }
       // System.out.println(Arrays.toString(arr2));  // for cheking "Copying"/Shifting is successful or not


        //Entering Element
        System.out.print("Insert a Array Element : ");
        num = sc.nextInt();
        sc.close();
        arr2[pos]=num;

        System.out.println("Printed Array after Inserted Element : ");

        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }
}