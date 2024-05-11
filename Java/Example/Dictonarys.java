import java.util.ArrayList;
import java.util.Hashtable;

public class Dictonarys {
    public static String read (Hashtable<Object, Object> table) {
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

    public static void main(String[] args) {
        Hashtable<Object, Object> Manas = new Hashtable<>();
        Manas.put("Name", "Manas");
        Manas.put("Age", 11);
        Manas.put("Birth-Date", "27/2/2024");
        System.out.println(read(Manas));
    }
}
