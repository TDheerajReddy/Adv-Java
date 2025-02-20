/*
Q3. Check whether below string is equal in both the directions
       NITIN
 */
public class CheckReverseString {
    public static void main(String args[]) {

        StringBuffer givenString = new StringBuffer("NITIN");
        StringBuffer reverseString = new StringBuffer(givenString);
        reverseString.reverse();
        System.out.println(givenString.compareTo(reverseString));
        
    }
    
}
