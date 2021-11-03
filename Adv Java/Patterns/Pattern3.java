/*
*****
****
***
**
*

*/

class Pattern3
{
    public static void main(String args[])
    {
        for(int r=1;r<=5;r++)                   //Row
        {
            for(int b=1;b<=6-r;b++)             //Block

            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
