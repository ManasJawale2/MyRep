package Java.Example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Java_File_Handling {
    public static void main(String[] args) throws IOException {
        File dir  = new File("Me");
        File file = new File(dir, "Me.txt");
        FileWriter fw = new FileWriter(file, true);
        fw.write("java");
        fw.write("\n");
        fw.write(11);
        fw.write("\n");
        fw.write(23);
        char ch[] = {'j', 'a', 'v', 'a'};
        fw.write(ch);
        fw.write("\n");
        fw.flush();
        System.out.println("ok");
    }
}
