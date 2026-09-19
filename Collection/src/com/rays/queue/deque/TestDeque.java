package com.rays.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestDeque {
    public static void main(String[] args) {

        Deque<String> d = new ArrayDeque<>();

        // 1. addFirst()
        d.addFirst("B");
        System.out.println(d);   // [B]

        // 2. addLast()
        d.addLast("C");
        System.out.println(d);   // [B, C]

        // 3. offerFirst()
        d.offerFirst("A");
        System.out.println(d);   // [A, B, C]

        // 4. offerLast()
        d.offerLast("D");
        System.out.println(d);   // [A, B, C, D]

        // 5. peekFirst()
        System.out.println(d.peekFirst());  // A

        // 6. peekLast()
        System.out.println(d.peekLast());   // D

        // 7. removeFirst()
        System.out.println(d.removeFirst()); // A
        System.out.println(d);               // [B, C, D]

        // 8. removeLast()
        System.out.println(d.removeLast());  // D
        System.out.println(d);               // [B, C]

        // 9. pollFirst()
        System.out.println(d.pollFirst());   // B
        System.out.println(d);               // [C]

        // 10. pollLast()
        System.out.println(d.pollLast());    // C
        System.out.println(d);               // []
        
    
        d.addFirst("A");
        System.out.println(d);
    }
}