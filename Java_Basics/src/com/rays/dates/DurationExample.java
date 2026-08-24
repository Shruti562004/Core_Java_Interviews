package com.rays.dates;

import java.time.Duration;
import java.time.LocalTime;

public class DurationExample {

    public static void main(String[] args) {

        LocalTime t1 = LocalTime.of(10, 30);
        LocalTime t2 = LocalTime.of(12, 45);

        Duration d = Duration.between(t1, t2);

        System.out.println("Hours: " + d.toHours());
        System.out.println("Minutes: " + d.toMinutes());  //135 minutes = 2 hours 15 minutes.
        System.out.println("Seconds: " + d.getSeconds());
    }
}