package DifferencebetweenHashMapandHashTable;

import java.util.Hashtable;

public class HashtableTestClass {
    public static void main(String[] args) {
        Hashtable<Integer, String> states = new Hashtable<>();
        states.put(1, "KOREA");
        states.put(2, "CHINA");

        //states.put(3, null); //will throw NullPointerEcxeption at runtime

        System.out.println(states.get(1));
        System.out.println(states.get(2));
        //System.out.println(states.get(3));

    }
}
