/*
*****
 ****
  ***
   **
    *
*/


class Pattern2
{
    public static void main(String args[])
    {
        for(int r=1;r<=5;r++)                   //Row
        {
            for(int s=1;s<=r-1;s++)             //Space
            {
                System.out.print(" ");
            }

            for(int b=1;b<=6-r;b++)             //Block
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
