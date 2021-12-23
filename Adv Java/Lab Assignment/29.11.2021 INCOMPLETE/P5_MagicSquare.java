//Magic square
import java.util.Scanner;
class P5_MagicSquare
{
	//int row,col,n;
	static int row,col,n;		// static object (class level)
    void up()
	{
		if (row==0)
			row=n-1;
		else 
			row--;				//up
	}
	void right()
	{
		if (col==n-1)
			col=0;
		else
			col++;				//right

	}
	void down()
	{
		if(row==n-1)
			row=0;
		else
			row++;				//down
	}
	void left()
	{
		if(col==0)
			col=n-1;
		else
			col--;				//left
	}
	void move(int a[][])
	{
		up();					//UP
		right();				//RIGHT
		if(a[row][col]!=0)
		{
			left();				//LEFT, (Returning to down)
			down();				//DOWN
			down();				//DOWN
		}
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);								//Scanner class object
		P5_MagicSquare ms = new P5_MagicSquare();						// Our classs object
		System.out.print("Number of rows or column (must be in odd value): ");
		n=sc.nextInt();
		sc.close();
		if(n%2==0)
		{														// Checking entered value of row or column is even?
			System.out.println("Enter Odd value of row or column!!!");
		}
		else
		{
			//int a[n][n],num=1;										// Logice Magic Square
			int a[][]=new int [n][n];
			row=0;
			col=n/2;
		
			for(int i=0;i<n*n;i++)
			{
				if(i==0)
				{
					a[row][col]=i+1;
				}
				else
				{
					ms.move(a);
					 a[row][col]=i+1;
				}
			}
		
			System.out.println("\nMagic Square is :\n");			// Printing matrix
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print("  "+a[i][j]+"  ");
				}
				System.out.println("\n");
			}
		}//else	
	}// End main()
} // End class
