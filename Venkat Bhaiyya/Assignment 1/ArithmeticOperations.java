// Q2. Perform Arithmetic operations.

import java.util.Scanner;

public class ArithmeticOperations {

    public static int sum(int a, int b) {
        return(a + b);
    }
    public static int multiply(int a, int b) {
        return(a * b);
    } 
    public static int substract(int a, int b) {
        return(a - b);
    } 
    public static int division(int a, int b) {
        return(a / b);
    }
    public static int mod(int a, int b) {
        return(a ^ b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter 1st number: ");
            int number1 = sc.nextInt();
            System.out.print("Enter 2nd number: ");
            int number2 = sc.nextInt();

            System.out.println("Addition: "+sum(number1, number2));
            System.out.println("Substract: "+substract(number1, number2));
            System.out.println("Multiply: "+multiply(number1, number2));
            System.out.println("Division: "+division(number1, number2));
            System.out.println("Modulus: "+mod(number1, number2));

            
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());

        } finally {
            sc.close();
        }

    }
    
}
