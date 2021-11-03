/*

    1    
   121   
  12321  
 1234321 
123454321

*/

class Pattern10
{
    public static void main(String args[])
    {
        for(int r=1;r<=5;r++)                   //Row
        {
            int num=r;                          //for second part
           
            for(int s=1;s<=5-r;s++)             //Space
            {
                System.out.print(" ");
            }

            for(int b1=1;b1<=r;b1++)             //Block
            {
                System.out.print(b1);
            }
            for(int b2=1;b2<=r-1;b2++)          //for second part
            {
                System.out.print(--num);
            }
            System.out.println();
            
        }
    }
    
}