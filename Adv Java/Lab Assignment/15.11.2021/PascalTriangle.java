/*

        1
       1 1
      1 2 1
     1 3 3 1
    1 4 6 4 1
   1 5 10 10 5 1
  1 6 15 20 15 6 1
 1 7 21 35 35 21 7 1
1 8 28 56 70 56 28 8 1


           1
          1 1
         1 2 1
        1 3 3 1
       1 4 6 4 1
      1 5 10 10 5 1
     1 6 15 20 15 6 1
    1 7 21 35 35 21 7 1
   1 8 28 56 70 56 28 8 1
  1 9 36 84 126 126 84 36 9 1

9X9 OR 10X10 OR user defined

*/

import java.util.Scanner;

class PascalTriangle
{
    public static void main(String[] args) 
    {
        int n,r,s,b,num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows for Pascal's Triangle: ");
        n=sc.nextInt();
        System.out.println();               //for line gap

        for(r=0;r<n;r++)                    //Row
        {
          for(s=0;s<=n-r;s++)               //Space
            {
                System.out.print(" ");
            }
            num=1;
            for(b=0;b<=r;b++)            //Print Numbers
            {
                System.out.print(num+" ");
                num=num*(r-b)/(b+1); 
            }
            System.out.println();           //for go to next line
        }
    }
}