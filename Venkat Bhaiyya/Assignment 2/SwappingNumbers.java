/*
Q8. Write a program to perform the following
    Given numbers :   a =10, b=45  
        Result :  a=45, b=10 ( a value moved to b:    b value moved to a ) 

 */
public class SwappingNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 45;

        a += b;
        b = a - b;
        a -= b;
        System.out.println("a = "+a+" b = "+b);
    }    
}
