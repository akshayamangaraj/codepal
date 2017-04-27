package com.subrat.practice.printoddandeven;

public class Class2 {

    boolean isOdd = false;

    synchronized void printEven(int number) {
        while (isOdd == false) {

            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println(number);
        isOdd = false;
        notifyAll();

    }

    synchronized void printOdd(int number) {
        while (isOdd==true) {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
        System.out.println(number);
        isOdd =true;
        notifyAll();

    }



}
