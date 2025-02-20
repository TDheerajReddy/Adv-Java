//Q2. Write a program to read the file contents and print content to console.
import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {
        public static void main(String[] args) {

        String fileName = "FileTxt.txt";
        String filePath = "E:\\Practice Coding\\Java\\Venkat Bhaiyya\\Assignment 4";
        String content = "";

        try {
            FileReader reader = new FileReader(filePath +"\\"+ fileName);

            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while((line = bufferedReader.readLine()) != null) {
                content += line + "\n";
            }

            bufferedReader.close();

            System.out.println(content);

        } catch (Exception e) {
            System.out.println("Error reading or printing the file: " + e.getMessage());
        }
    }
    
}
