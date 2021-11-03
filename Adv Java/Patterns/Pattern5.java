
/*

***********
***** *****
****   ****
***     ***
**       **
*         *
**       **
***     ***
****   ****
***** *****
***********

*/
class Pattern5
{
    public static void main(String args[])
    {
        for(int b1=1;b1<=11;b1++)           //For last 11 Stars/Blocks
        {
            System.out.print("*");
        }
        System.out.println();

        for(int r=1;r<=4;r++)               //Row
        {
            for(int b1=1;b1<=6-r;b1++)      //Coloumn
            {
                System.out.print("*");
            }
            for(int s=1;s<=2*r-1;s++)       //Coloumn
            {
                System.out.print(" ");
            }
            for(int b2=1;b2<=6-r;b2++)      //Coloumn
            {
                System.out.print("*");
            }
            System.out.println();           //New Line
        }

        for(int r=1;r<=5;r++)               //Row
        {
            for(int b1=1;b1<=r;b1++)        //Coloumn
            {
                System.out.print("*");
            }
            for(int s=1;s<=11-2*r;s++)      //Coloumn
            {
                System.out.print(" ");
            }
            for(int b2=1;b2<=r;b2++)        //Coloumn
            {
                System.out.print("*");
            }
            System.out.println();           //New Line
        }

        for(int b1=1;b1<=11;b1++)
        {
            System.out.print("*");          //For last 11 Stars/Blocks
        }

    }
}
