/*
Q4. Find all the occurrences of A in the below string
    HELLO HOW ARE  YOU AND WHERE ARE 
 */
public class FindOccurrences {
    public static void main(String[] args) {
        String str = new String("HELLO HOW ARE  YOU AND WHERE ARE");
        int i = str.indexOf("A");
        System.out.println(i);
        i = str.indexOf("A",11);
        System.out.println(i);
        i = str.indexOf("A",20);
        System.out.println(i);
        i = str.indexOf("A",30);
        System.out.println(i);
/*__________________________________________________________________________________________________________________ */
        char c = 'A';
        int count = 0;
        for (int j = 0; j < str.length(); j++) {
          if (str.charAt(j) == c) {
            count++;
          }
        }
        System.out.println("Count of character '" + c + "' is " + count);
    }
    
}
