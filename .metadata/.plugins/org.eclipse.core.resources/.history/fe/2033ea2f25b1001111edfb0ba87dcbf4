package com.rays.map;



import java.util.HashMap;
import java.util.Map;

public class Methods {

    public static void main(String[] args) {

        Map<Integer, String> m = new HashMap<>();

        // 1. put()
        m.put(1, "Shruti");
        m.put(2, "Rahul");
        m.put(3, "Aman");
        System.out.println(m);

        // 2. get()
        System.out.println(m.get(1)); 
        // Shruti

        // 3. remove()
        m.remove(3);
        System.out.println(m);
        // {1=Shruti, 2=Rahul}

        // 4. containsKey()
        System.out.println(m.containsKey(2));
        // true

        // 5. containsValue()
        System.out.println(m.containsValue("Shruti"));
        // true

        // 6. size()
        System.out.println(m.size());
        // 2

        // 7. isEmpty()
        System.out.println(m.isEmpty());
        // false

        // 8. putIfAbsent()
        m.putIfAbsent(3, "Aman");
        System.out.println(m);
        // {1=Shruti, 2=Rahul, 3=Aman}

        // 9. replace()
        m.replace(2, "Rohit");
        System.out.println(m);
        // {1=Shruti, 2=Rohit, 3=Aman}

        // 10. getOrDefault()
        System.out.println(m.getOrDefault(5, "Not Found"));
        // Not Found

        // 11. keySet()
        System.out.println(m.keySet());
        // [1, 2, 3]

        // 12. values()
        System.out.println(m.values());
        // [Shruti, Rohit, Aman]

        // 13. entrySet()
        System.out.println(m.entrySet());
        // [1=Shruti, 2=Rohit, 3=Aman]

        // 14. clear()
        m.clear();
        System.out.println(m);
        // {}
    }
}
