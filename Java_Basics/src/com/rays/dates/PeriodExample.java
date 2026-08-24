package com.rays.dates;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {

    public static void main(String[] args) {

        LocalDate d1 = LocalDate.of(2020, 5, 10);
        LocalDate d2 = LocalDate.of(2026, 8, 20);

        Period p = Period.between(d1, d2);

        System.out.println("Years: " + p.getYears());
        System.out.println("Months: " + p.getMonths());
        System.out.println("Days: " + p.getDays());
    }
}