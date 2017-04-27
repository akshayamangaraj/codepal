/**
 *
 */
package com.subrat.geeksforgeeks;

import java.util.Arrays;

/**
 * @author sparid2
 *
 */
public class ArrayInMaxiumMinimumForm {
    static int[] array= new int[]{3,1,7,0,9,5};

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub


        Arrays.sort(array);
        /*for (int i : array) {
            System.out.println(i);
        }*/

        int start = 0;
        int end = array.length-1;

        while(true){

        if(start>=end){
            return;
        }

                printArray(end,start);
                start++;
                end--;
        }


        }




    private static void printArray(int end, int start) {
        System.out.println(array[end]);
        System.out.println(array[start]);

    }

}
