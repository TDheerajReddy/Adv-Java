/*

    * 
   * *
  * * *
 * * * *
* * * * *

*/

class Pattern7
{
    public static void main(String args[])
    {
        for(int r=1;r<=5;r++)                   //Row
        {
            for(int s=1;s<=5-r;s++)             //Space
            {
                System.out.print(" ");
            }

            for(int b=1;b<=r;b++)             //Block
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
