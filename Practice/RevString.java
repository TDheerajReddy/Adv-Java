import java.util.Scanner;  
class RevString  
{  
    public static void main(String args[])  
    {  
        String s;
        int j = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("    *\n   **\n ****\n*****");
        System.out.print("Enter a String: "); 
        s=sc.nextLine();                    //reading string from user
        char arr[] = new char[s.length()];
        System.out.print("After reverse string is: ");  
        for(int i=s.length();i>0;i--)                //i is the length of the string  
        {  
            System.out.print(s.charAt(i-1));            //printing the character at index i-1  
            arr[j]=s.charAt(i-1);
            j++;
        }  
    }  
}