class Pattern14
{ 
    public static void main(String[] args)
    {
        for(int r=1;r<=9;r++)                  
        {
            System.out.print("*");
        }
        System.out.println();
        for(int r=1;r<4;r++)
        {
            for(int c=1;c<=9;c++)             
            {
                if(c==1||c==9)
                {
                  System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int r=1;r<=9;r++)                   
        {
            System.out.print("*");
        }
        System.out.println();
    }
}