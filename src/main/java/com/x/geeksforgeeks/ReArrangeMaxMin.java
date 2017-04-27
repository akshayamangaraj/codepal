/**
 *
 */
package com.subrat.geeksforgeeks;

public class ReArrangeMaxMin {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 10, 20 };

        int length = arr.length;

        int[] arrNew = new int[length];

        int count = 0;

        int loopLength = length / 2;

        for (int i = 0; i < loopLength; i++) {

            int getMin = arr[i];

            int getMax = arr[length - 1 - i];

            arrNew[count] = getMax;

            arrNew[count + 1] = getMin;

            count = count + 2;

        }

        if (length % 2 != 0) {

            arrNew[length - 1] = arr[length / 2];

        }

        for (int i : arrNew) {
            System.out.print(i+",");
        }

    }

}