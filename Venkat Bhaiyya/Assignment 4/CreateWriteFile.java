//Q1. Write a program to create a file and write content to the created file.
import java.io.FileWriter;

public class CreateWriteFile {
    public static void main(String args[]) {

        String fileName = "FileTxt.txt";
        String filePath = "E:\\Practice Coding\\Java\\Venkat Bhaiyya\\Assignment 4";
        String content = "This is an example file created using Java.";

        try {
            FileWriter fw = new FileWriter(filePath +"\\"+ fileName);

            fw.write(content);

            fw.close();

            System.out.println("File created and content is written successfully.");
        } catch (Exception e) {
            System.out.println("Error creating or writing to the file: " + e.getMessage());
        }
    }
}