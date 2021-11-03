
/*

     *
    ***
   *****
  *******
 *********
***********
 *********
  *******
   *****
    ***
     *

*/
class Pattern6
{
    public static void main(String args[])
    {
        //Opposite of Patter5 with 9 rows

        for(int r=1;r<=4;r++)               //Row
        {
            for(int b1=1;b1<=6-r;b1++)      //Coloumn
            {
                System.out.print(" ");
            }
            for(int s=1;s<=2*r-1;s++)       //Coloumn
            {
                System.out.print("*");
            }
            for(int b2=1;b2<=6-r;b2++)      //Coloumn
            {
                System.out.print(" ");
            }
            System.out.println();           //New Line
        }

        for(int r=1;r<=5;r++)               //Row
        {
            for(int b1=1;b1<=r;b1++)        //Coloumn
            {
                System.out.print(" ");
            }
            for(int s=1;s<=11-2*r;s++)      //Coloumn
            {
                System.out.print("*");
            }
            for(int b2=1;b2<=r;b2++)        //Coloumn
            {
                System.out.print(" ");
            }
            System.out.println();           //New Line
        }
        System.out.println();

        Pattern6 pt6 = new Pattern6();
        pt6.stars11();
    }

    void stars11()
    {
        for(int r=1;r<=5;r++)               //Upper Part
        {
            for(int s=1;s<=6-r;s++)
            {
                System.out.print(" ");
            }
            for(int b=1;b<=2*r-1;b++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int r=1;r<=6;r++)               //Lower Part
        {
            for(int s=1;s<=r-1;s++)
            {
                System.out.print(" ");
            }
            for(int b=1;b<=13-2*r;b++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
