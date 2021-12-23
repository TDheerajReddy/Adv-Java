class Pattern11
{ //Hollo Pyraamid Method number 1
    public static void main(String args[])
    {
        for(int row=1;row<=5;row++)
        {   
            for(int col=1;col<=5+5-1;col++)
            {
                if(row==5 || row+col==5+1 || col-row==5-1) 
                    System.out.print("*");
                else 
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

}