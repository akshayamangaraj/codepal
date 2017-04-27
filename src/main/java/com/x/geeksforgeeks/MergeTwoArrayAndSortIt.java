/**
 *
 */
package com.subrat.geeksforgeeks;

import java.util.Arrays;

/**
 * @author sparid2
 *
 */
public class MergeTwoArrayAndSortIt {

    // swap() doesn't swap i and j
    public static void main(String[] args) {
            int[] ar1 = {2,3,5,9,10,13};
            int[] ar2 = {8,12,20};

            sortTwo(ar1, ar2);
        }

        private static void sortTwo(int[] ar1, int[] ar2) {
            int i = 0;
            int j = 0;
            while(i<ar1.length){

                if(j < ar2.length && ar2[j] < ar1[i]){
                    int temp = ar1[i];
                    ar1[i] = ar2[j];
                    rearrangeAr2(ar2 , j , temp);
                }
                i++;
            }

            System.out.println(Arrays.toString(ar1));
            System.out.println(Arrays.toString(ar2));
        }

        private static void rearrangeAr2(int[] ar2, int j, int temp) {

            for (int i = j+1; i < ar2.length; i++) {
                if(i-1 == 0){
                ar2[j] = temp;
                }
                if(temp > ar2[i]){
                    ar2[i-1] = ar2[i];
                    ar2[i] = temp;
                }else{

                    break;
                }
            }
        }
    }
