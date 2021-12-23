//Jagged Array
import java.util.Scanner;
class JaggedArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int c1=0;
        String arr[][] = new String[4][];
        arr[0]= new String[4];
        arr[1]= new String[3];
        arr[2]= new String[5];
        arr[3]= new String[2];

        //Input
        System.out.println("input");
        for(int i=0;i<arr.length;i++)
        {
        System.out.print("\ncolumn ="+c1+"\n");

            for(c1=0;c1<arr[i].length;c1++)
            {
                arr[i][c1]=sc.next();
            }

        }

        //Output
        System.out.println("output");
        for(int i=0;i<arr.length;i++)
        {
            for(c1=0;c1<arr[i].length;c1++)
            {
                System.out.print(" "+arr[i][c1]);
            }
            System.out.println();
        }
        
    }

}