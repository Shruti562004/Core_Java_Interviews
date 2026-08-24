package com.rays.arrays;


public class FindPosition {

    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 4, 5,4};

        int num = 4;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == num) {
                System.out.println("Position = " + (i));
              break;// duplicate    does'nt exist
            }
        }
    }
}
