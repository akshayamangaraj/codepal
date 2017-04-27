/**
 *
 */
package com.subrat.practice.mergeintervals;

/**
 * @author sparid2
 *
 */
public class Interval {

    int lo;
    int hi;



    public Interval(int lo,int hi) {
        this.lo = lo;
        this.hi = hi;
    }

    public String toString(){
        return "["+lo+","+hi+"]";
    }

}
