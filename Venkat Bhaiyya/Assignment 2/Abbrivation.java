/*Q2. WAP to display abbrivation based on the selected data: 
Texas, NewYork, Georgia, NewJersey, Nebraska
if you choose 1 then display Texas, choose 4 then display NewJersey.
(Use Switch-Case statement)
*/

import java.util.*;
public class Abbrivation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for different cities respectively: Texas, NewYork, Georgia, NewJersey, Nebraska: ");
        switch (sc.nextInt()) {
            case 1:
                System.out.println("Texas");
                break;
            case 2:
                System.out.println("New York");
                break;
            case 3:
                System.out.println("Georgia");
                break;
            case 4:
                System.out.println("New Jersey");
                break;
            case 5:
                System.out.println("Nebraska");
                break;
            default:
                System.out.println("Incorrect Choice!!!");
                break;
        }       
    }
    
}
