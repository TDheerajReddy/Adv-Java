class pattern12
{   //Hollo Pyraamid Method number 2
    public static void main(String[] args)
    {
        for(int r=1;r<=5;r++)                   //Row
        {
            for(int s1=1;s1<=6-r;s1++)             //Space
            {
                System.out.print(" ");
            }
            if(r==1||r==5)
            {
                for(int b1=1;b1<=2*r-1;b1++)             //Block
                {
                    System.out.print("*");
                }
            }
            else
            {
                for(int b1=1;b1<=2*r-1;b1++)             //Block
                {
                    if(b1==1||b1==2*r-1)
                    {
                            System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}