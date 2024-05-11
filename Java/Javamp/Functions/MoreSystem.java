package Functions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class MoreSystem {
    public void log(String[] str) {
        for (String string : str) {
            System.out.print(string);
        }
        System.out.println();
    }

    public String slugify(String str, char ch) {
        return str.replace(' ', ch);
    }

    public static String read(Hashtable<Object, Object> table) {
        ArrayList<Object> Keys = new ArrayList<>();
        ArrayList<Object> Values = new ArrayList<>();
        for (Object K : table.keySet().toArray()) {
            Keys.add(K);
        }
        for (Object V : table.values().toArray()) {
            Values.add(V);
        }
        String result = new String();
        for (int i = 0; i < table.size(); i++) {
            result += Keys.get(i) + ": " + Values.get(i) + "\n";
        }
        return result;
    }

    public static String readFile(File file) throws FileNotFoundException {
        String line = new String();
        Scanner sc = new Scanner(file);
        while (line != null) {
            line += sc.nextLine();
        }
        return line;
    }
    
    public static int getNoofWords(String str) {
        int noofWords = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                noofWords++;
            }
        }
        return noofWords;
    }

    public static int getNoofLines(String str) {
        int NoofLines = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '\n') {
                NoofLines++;
            }
        }
        return NoofLines;
    }

    public static boolean Or(boolean a, boolean b) {
        return a || b;
    }

    public static boolean And(boolean a, boolean b) {
        return a && b;
    }

    public static boolean Not(boolean a) {
        return !a;
    }

    public static boolean XOr(boolean a, boolean b) {
        return Or(And(a, Not(b)), And(b, Not(a)));
    }

    public static boolean NAnd(boolean a, boolean b) {
        return Not(And(a, b));
    }

    public static boolean NOr(boolean a, boolean b) {
        return Not(Or(a, b));
    }

    public static boolean XNOr(boolean a, boolean b) {
        return Or(And(a, b), And(Not(a), Not(b)));
    }

}