//import java.util.Scanner;

class magicsqure
{
    public static void main(String[] args)
    {
       /* int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter only odd size array = ");
        int size=sc.nextInt();*/
        int a[][]=new int[3][3];
       /* System.out.print("Enter array values");
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        //int i=0;
        j=size/2;
        int num=1;
        a[i][j]=num;
        while(num<=size*size)
        {
            if(a[i][j]==0)
            {
                if(i==0)
                {
                    i=size-1;
                }
                else
                {
                    i--;
                }

                if(j==size-1)
                {
                    j=0;
                }
                else
                {
                    j++;
                }
            }
            else
            {
                if(j==0)
                {
                    j=size-1;
                }
                else
                {
                    j--;
                }

                if(i==size-1)
                {
                    i=0;
                }
                else
                {
                    i++;
                }

                if(i==size-1)
                {
                    i=0;
                }
                else
                {
                    i++;
                }
            a[i][j]=num++;
            }
        }
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a.length;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println(" ");
        }
    }    
}*/
       int i=0;
        int j=3/2;
        int num=1;
        a[i][j]=num;
        while(num<=3*3)
        {
            
            if(a[i][j]==0)
            {
                if(i==0)
                {
                    i=3-1;
                }
                else
                {
                    i--;
                }

                if(j==3-1)
                {
                    j=0;
                }
                else
                {
                    j++;
                }
            }
            else
            {
                if(j==0)
                {
                    j=3-1;
                }
                else
                {
                    j--;
                }

                if(i==3-1)
                {
                    i=0;
                }
                else
                {
                    i++;
                }

                if(i==3-1)
                {
                    i=0;
                }
                else
                {
                    i++;
                }
            a[i][j]=num++;
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println(" ");
        }
    }
}