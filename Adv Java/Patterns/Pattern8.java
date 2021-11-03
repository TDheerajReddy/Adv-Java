/*

1*
1*2*
1*2*3*
1*2*3*4*
1*2*3*4*5*

*/

class Pattern8
{
    public static void main(String args[])
    {
        for(int r=1;r<=5;r++)                   //Row
        {
            for(int b=1;b<=r;b++)             //Block
            {
                System.out.print(b+"*");
            }
            System.out.println();
        }
    }
}