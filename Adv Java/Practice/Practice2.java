import java.util.Scanner;

// Remember that the class name should be "Main" and should be "public".
public class Practice2
{
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

		// Read the number of test casese.		
		int T = in.nextInt();
		while (T-->0)
		{
			// Read the numbers a and b.
			int a = in.nextInt();
			int b = in.nextInt();
			
			// Compute the sum of a and b.
			int ans = a + b;
			System.out.println(ans);
		}
        in.close();
	}
}