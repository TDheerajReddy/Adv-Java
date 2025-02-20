/*
Q6. Display the below pattern:
a
ab
abc
abcd
abcde
abcdef

*/
public class abcdefPattern {
    public static void main(String[] args) {
        char ch = 'a';
        for(int i=1; i <= 6; i++) {
            ch = 'a';
            for(int j=1; j <= i; j++) {
                System.out.print(ch++ +" ");
            }
            System.out.println();
        }
    }
    
}
