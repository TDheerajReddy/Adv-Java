//Q3. Find the sum of digits in the given number: 4556. Result: 4+5+5+6 = 20

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 4556;
        int sum=0;
        while(number != 0) {
            sum += number % 10;
            // System.out.println("Sum = "+sum);
            number /= 10;
            // System.out.println("Number = "+number);

        }
        System.out.println("Sum of Digits is: "+sum);

    }
}
