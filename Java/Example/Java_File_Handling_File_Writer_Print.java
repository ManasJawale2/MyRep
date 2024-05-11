package Java.Example;

import java.io.*;

public class Java_File_Handling_File_Writer_Print {
    public static void main(String[] args) throws IOException {
        File file = new File("Demo.txt");
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println(34);
        printWriter.println("Hi");
        printWriter.println(true);
        printWriter.println(3.45f);
        printWriter.println(3.454555D);
        printWriter.println('C');
        printWriter.close();
        System.out.println(file);
        char ch[] = new char[(int)file.length()];
        FileReader fd = new FileReader(file);
        long i = 999999999999999999L+9999999999999999L;
        System.out.println(i);
        fd.read(ch);
        for(char data : ch) {
            System.out.print(data);
        }

    }

}
