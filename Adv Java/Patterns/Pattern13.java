class Pattern13
{   //Pyramid
    public static void main(String[] args)
    {
        for(int r=0;r<=5;r++)                   //Row
        {
            for(int s1=1;s1<=5-r;s1++)             //Space
            {
                System.out.print(" ");
            }

            for(int b1=0;b1<=2*r;b1++)             //Block
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
