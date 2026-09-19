package com.rays.exception;

public class TryMultipleCatch2 {

	public static void main(String[] args) {

		// arrayInde

		try {

			int a[] = { 5, 7, 5 };

			System.out.println(a[4]);

			int c = 10 / 0; // arithmetic occurs

			System.out.println("hjhhj");
			System.out.println(c);
		} catch (NullPointerException e1) {

			System.out.println("hjhhj");
			e1.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

		finally {
			System.out.println("finallyy");
		}

	}

}
