//Q5. Create both Default & Parameterized constructor and print their content.

public class Cons {
    int a;
    int b;
    Cons() {
        System.out.println("Default Constructor: ");
        System.out.println("a = "+a+" b = "+b);
    } 
    Cons(int a, int b) {
        System.out.println("\nParameterized Constructor: ");
        System.out.println("a = "+a+" b = "+b);
    }

    public static void main(String[] args) {
        Cons c1 = new Cons();
        new Cons(4, 22);
    }
}
