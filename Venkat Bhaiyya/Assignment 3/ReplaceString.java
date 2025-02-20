/*
Q5. Check whether “institute” word is present in the below sentence. If it exists, replace first 3 characters of institute with JSS.
        This is a java institute of insurance and insu.
 */
public class ReplaceString {
    public static void main(String[] args) {
        String str = new String("This is a java institute of insurance and insu.");
        String replacedSentence = "";
        if (str.contains("institute")) {
            replacedSentence = str.replaceFirst("ins", "JSS");
        }
        System.out.println(replacedSentence);
    }
}
