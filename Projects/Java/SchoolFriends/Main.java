package Projects.Java.SchoolFriends;

import Functions.MoreSystem;
import java.util.ArrayList;
import java.util.Hashtable;

public class Main {
    public static Hashtable<Object, Object> ReadyTable(Object[] Ks, Object[] Vs) {
        if (Ks.length != Vs.length) {
            return null;
        }
        Hashtable<Object, Object> table = new Hashtable<>();
        for (int i = 0; i < Vs.length; i++) {
            table.put(Ks[i], Vs[i]);
        }
        return table;
    }

    public static void main(String[] args) {
        Hashtable<Object, Object> Me = ReadyTable(
                new Object[] {
                    "Name",
                    "Age",
                    "Birth-Date",
                    "Location"
                },
                new Object[] {
                    "Manas",
                    11,
                    "27/2/2024",
                    "Varangaon, Jalgaon, Maharastra"
                });
        ArrayList<Hashtable<Object, Object>> arr = new ArrayList<>();
        arr.add(Me);
        System.out.println(MoreSystem.read(arr.get(0)));
    }
}
