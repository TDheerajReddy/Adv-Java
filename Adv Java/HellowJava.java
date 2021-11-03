import java.util.Scanner;

class HellowJava
{
    public static void main(String args[])
    {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hellow Java");
        System.out.print("Input Value : ");
        a = sc.nextInt();
        System.out.println("a = "+a);
        sc.close();
    }
}