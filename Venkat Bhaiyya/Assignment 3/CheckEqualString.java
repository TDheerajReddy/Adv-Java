/*
Q2. Compare whether below strings are equal or not
      Hello HELLO
 */
public class CheckEqualString {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("HELLO");

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("String is Equal");            
        } else {
            System.out.println("String is NOT Equal!!!");
        }
    }    
}