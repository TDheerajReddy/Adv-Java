//Swapping Without 3rd variable
import java.util.Scanner;
class Wintout3rd
{
    public static void main(String[] args)
    {
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number 1 : ");
        num1 = sc.nextInt();

        System.out.print("Enter Number 2 : ");
        num2 = sc.nextInt();
        sc.close();
        //Swapping Start
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;      

        System.out.print("Number 1 = "+num1+"\nNumber 2 = "+num2);  
    }
    
}
