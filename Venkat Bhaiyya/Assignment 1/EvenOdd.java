//Q3. Print Even and Odd numbers between range 1 to 50
public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Even Numbers: ");
        for(int i=1; i <= 50; i++) {
            if(i%2 == 0) {
                System.out.print(i+" ");
            }
        }

        System.out.println("\n\nOdd Numbers: ");
        for(int i=1; i <= 50; i++) {
            if(i%2 != 0) {
                System.out.print(i+" ");
            }
        }
    }
}
