package exceptionhandling;

import java.io.*;
import java.util.Scanner;

public class FileEx {
    public static void main(String[] args) {
        try{
            File file = new File("Test.txt");
//            Scanner scanner = new Scanner(file);
            FileWriter writer = new FileWriter("Exam.txt");
            writer.close();
            writer.write("Wow, hi!");
        }
        catch (IOException e) {
            System.out.println("Exception: " + e.toString());
        }

    }
}
