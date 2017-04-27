/**
 *
 */
package com.x.arrayListImplementation;

import java.util.Arrays;

/**
 * @author sparid2
 *
 */
public class MyArrayListPractice {

    private Object[] array = null;
    private int actualSize = 0;

    public MyArrayListPractice(){
        array = new Object[10];
    }

    private void add(Object data){

        if(array.length-actualSize <=array.length/2){
            increaseList();
        }

        array[actualSize++] = data;

    }

    private int size(){
        return actualSize;
    }

    private void remove(int index){

        if (index < actualSize){

                array[index]=null;
                while(index<actualSize){
                    array[index]=array[index+1];
                    array[index+1] = null;
                    index++;
                }
                actualSize = actualSize-1;

        }else{
            throw new ArrayIndexOutOfBoundsException();
        }

    }

    private Object get(int index){

        if(index<actualSize){
            return array[index];
        }else{
            throw new ArrayIndexOutOfBoundsException();
        }


    }

    private void increaseList(){
        Arrays.copyOf(array, array.length*2);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        MyArrayListPractice myArrayListPractice = new MyArrayListPractice();
        myArrayListPractice.add(2);
        myArrayListPractice.add(20);
        myArrayListPractice.add(21);
        myArrayListPractice.add(12);
        myArrayListPractice.add(4);
        Integer size = myArrayListPractice.size();
        System.out.println("Size is :"+size);
        Integer data = (Integer) myArrayListPractice.get(0);
        System.out.println("Data in 0th position is: "+data);
        myArrayListPractice.remove(0);
        System.out.println("Updated size is :"+myArrayListPractice.size());
        myArrayListPractice.add(34);
        myArrayListPractice.add(342);
        System.out.println("Second updated size is :"+myArrayListPractice.size());
    }

}
