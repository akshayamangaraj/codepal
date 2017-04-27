/**
 *
 */
package com.subrat.practice.printoddandeven;

/**
 * @author sparid2
 *
 */
public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Class2 object = new Class2();

        Thread t1 = new Thread(new Class1(false, 10, object));
        Thread t2 = new Thread(new Class1(true, 10, object));
        t1.start();
        t2.start();

    }

}
