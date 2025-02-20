/*
Q1. "This is my first String program. I Will be dealing with all the methods of String."
In the above sentence , perform the following
    a. Count the number of words
    b. Find the length of string
    c. Replace all the occurrences of String with STR
    d. Replace all spaces with comma 
    e. Find the position of Program and get only 3 characters i.e. Pro

 */
public class StringOperations {
    public static void main(String[] args) {
        String str = new String("This is my first String program. I Will be dealing with all the methods of String.");
        
        int count = str.split(" ").length;
        int length = str.length();
        System.out.println(count);
        System.out.println(length);

        str = str.replace("String", "STR");
        System.out.println(str);

        str = str.replace(" ", ",");
        System.out.println(str);
        
        System.out.println(str.indexOf("program"));
        System.out.println(str.substring(21,24));
    }
}