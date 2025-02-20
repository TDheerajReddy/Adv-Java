//Q6. Display names in sorting order. Exaample: Plano, Irving, Frisco, Dallas
import java.util.*;

public class NameSorting {
        public static void main(String[] args) {
            ArrayList<String> names = new ArrayList<String>();
            names.add("Frisco");
            names.add("Irving");
            names.add("Plano");
            names.add("Dallas");

            System.out.println("Ascending Order: ");
            names.sort((a,b) -> {return a.compareTo(b);});
            System.out.println(names);

            // names.sort((a,b) -> {return -1 * a.compareTo(b);});
            
            System.out.println("\nDescending Order: ");
            names.sort((a,b) -> {return -a.compareTo(b);});
            for(String name : names) {
                System.out.println(name);
            }
        }
}
