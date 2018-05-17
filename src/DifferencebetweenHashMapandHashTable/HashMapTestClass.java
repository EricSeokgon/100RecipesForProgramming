package DifferencebetweenHashMapandHashTable;

import java.util.HashMap;

public class HashMapTestClass {
    public static void main(String[] args) {
        HashMap<Integer, String> states = new HashMap<>();

        states.put(1, "KOREA");
        states.put(2, "CHINA");
        states.put(3, null); //ok
        states.put(null, "JAPAN");

        System.out.println(states.get(1));
        System.out.println(states.get(2));
        System.out.println(states.get(3));
    }
}
