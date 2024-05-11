package Java.Example;

import java.io.*;

public class File_Handling_Project {
    public static void main(String[] args) throws IOException  {
        FileWriter f = new FileWriter("C:\\Users\\shiv\\Documents\\Java_Edited.txt");
        f.write("manas is g");
        f.close();
    }
}
