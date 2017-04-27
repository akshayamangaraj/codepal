/**
 *
 */
package com.subrat.practice.sorting;

/**
 * @author sparid2
 *
 */
public class MergeSortInPractice {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Integer [] array = {20, 78, 2, 6, 44, 18, 91, 5, 7};

        mergeSort(array);


    }

    private static Comparable[] mergeSort(Comparable[] array) {

        if(array.length <=1){
            return array;
        }

        Comparable[] firstArray = new Comparable[array.length / 2];
        Comparable[] secondArray = new Comparable[array.length - firstArray.length];
        System.arraycopy(array, 0, firstArray, 0, firstArray.length);
        System.arraycopy(array, secondArray.length-1, secondArray, 0, secondArray.length);
        mergeSort(firstArray);
        mergeSort(secondArray);
        merge(firstArray, secondArray,array);
        return array;

    }



    private static void merge(Comparable[] firstArray, Comparable[] secondArray, Comparable[] array) {

        int a=0;
        int b=0;
        int c=0;


        while(a<firstArray.length && b<secondArray.length){
            if(firstArray[a].compareTo(secondArray[b]) < 0){
                array[c++]=firstArray[a++];
            }else{
                array[c++]=firstArray[b++];
            }
        }

        while(a<firstArray.length){
            array[c++]=firstArray[a++];
        }

        while(b<secondArray.length){
            array[c++]=secondArray[b++];
        }

        for (Comparable comparable : array) {
            System.out.println(comparable+",");
        }

    }



}
