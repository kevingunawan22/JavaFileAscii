import java.io.File;
import java.io.PrintWriter;
import java.io.*;
import java.util.Scanner;

public class A {
    public static void main(String[] args) throws IOException{


        FileWriter type = new FileWriter("file.txt",true);
        PrintWriter createFile = new PrintWriter("file.txt");


        Scanner keyboard = new Scanner(System.in);
        char asci=keyboard.next().charAt(0);
        createFile.println(asci);
        createFile.println((int)asci);
        createFile.close();



































    }
}
