//Q5.Reverse the given number and display the output. Given Number: 8976.
public class ReverseNumber {
    public static void main(String args[]) {
        int number = 8976;
        int reverse=0, remainder;
        while(number != 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }
        System.out.println("Reversed Number: "+reverse);
    }
}
