/**
 *
 */
package com.subrat.geeksforgeeks;

import java.util.Arrays;

/**
 * @author sparid2
 *
 */
public class ArrangeMaxMinMaxMin {

    private static int[] array = {1,9,10,40,6,98};
    static int count = 0;
    private static int[] newArray = new int[array.length];


    /**
     * @param args
     */
    public static void main(String[] args) {
        Arrays.sort(array);
        for (int i = 0; i < array.length/2; i++) {

            newArray[count]= array[array.length-1-i];
            newArray[count+1]= array[i];
            count = count+2;


        }

        if(array.length%2 !=0){
            newArray[newArray.length-1] = array[array.length/2];
        }

        for (int i : newArray) {
            System.out.println(i);

        }
    }

}
