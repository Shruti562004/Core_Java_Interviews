package com.rays.dates;

import java.time.LocalDate;

public class LocalAdvanceMethods {
	
	public static void main(String[] args) {

        LocalDate date = LocalDate.of(2026, 8, 20);

        System.out.println("Original Date: " + date);

        System.out.println("After 10 Days: " + date.plusDays(10));

        System.out.println("After 2 Months: " + date.plusMonths(2));

        System.out.println("After 1 Year: " + date.plusYears(1));

        System.out.println("Before 5 Days: " + date.minusDays(5));

        System.out.println("Before 1 Month: " + date.minusMonths(1));

        System.out.println("Before 1 Year: " + date.minusYears(1));
	}

}
