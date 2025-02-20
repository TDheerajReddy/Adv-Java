//Q4. Find nubers that are divisible by 4  in between 10 to 50 range ?
public class DivisibleBy4 {
    public static void main(String args[]) {
        for(int i=10; i<=50; i++) {
            if(i%4 == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
