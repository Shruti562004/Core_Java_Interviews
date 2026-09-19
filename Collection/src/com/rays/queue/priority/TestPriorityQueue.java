package com.rays.queue.priority;
import java.util.PriorityQueue;

public class TestPriorityQueue {
    public static void main(String[] args) {

        PriorityQueue<Integer> q = new PriorityQueue<>();

        q.add(30);
        q.add(10);
        q.add(20);

        System.out.println(q);

        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
    }
}
