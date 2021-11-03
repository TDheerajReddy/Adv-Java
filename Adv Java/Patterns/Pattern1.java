
/*

*
**
***
****
*****

*/


class Pattern1 
{
    public static void main(String args[])
    {
        for(int r=1;r<=5;r++)               //Row
        {
            for(int c=1;c<=r;c++)           //Coloumn
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
