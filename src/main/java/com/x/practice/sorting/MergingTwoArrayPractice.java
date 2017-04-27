/**
 *
 */
package com.subrat.practice.sorting;

import java.util.Arrays;

/**
 * @author sparid2
 *
 */
public class MergingTwoArrayPractice {

    static int[] a = { 5, 1, 4, 8, 2 };
    static int[] b = { 15, 10, 4, 80, 2 };
    static int[] c = new int[a.length + b.length];



    /**
     * @param args
     */
    public static void main(String[] args) {

        mergeTwoArray(a, b);
        printArray();

    }

    private static void printArray() {
        for (int i : c) {
            System.out.print(i+",");
        }
    }

    private static void mergeTwoArray(int[] a, int[] b) {

        Arrays.sort(a);
        Arrays.sort(b);

        int a1 = 0, b1 = 0, c1 = 0;


        while (a1 < a.length && b1 < b.length) {
            if (a[a1] < b[b1]) {
                c[c1++] = a[a1++];
            } else {
                c[c1++] = b[b1++];
            }
        }

        while (a1 < a.length) {
            c[c1++] = a[a1++];
        }

        while (b1 < b.length) {
            c[c1++] = b[b1++];
        }

    }
}