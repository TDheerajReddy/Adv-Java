import java.util.Scanner;
public class Practice1 {
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
        Scanner ip = new Scanner(System.in);
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i] = ip.nextInt();
        }
        ip.close();
        for(int i=0;i<n;i++)
        {
            sum=(sum)+(arr[i]);
        }
        return(sum);
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        ip.close();

        int arr[] = new int[n];
        Practice1 p1= new Practice1();

        System.out.println(p1.maxSubarraySum(arr, n));
    }
}