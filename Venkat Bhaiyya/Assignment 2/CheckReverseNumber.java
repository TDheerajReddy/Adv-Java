/*
Q7. Write a program to display both given and reverse number are same .
    Example :   Given Number : 161 and  Reversed Number : 161 
 */
public class CheckReverseNumber {
    public static void main(String[] args) {

        int givenNumber = 11;
        int reverse=0, remainder, number = givenNumber;

        while(number != 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }
        System.out.println("Reversed Number: "+reverse);

        if(givenNumber == reverse) {
            System.out.println("Reversed Number is Same: "+givenNumber +" == "+reverse);
        } else {
            System.out.println("Reversed Number is NOT Same !!!");
        }
    }    
}