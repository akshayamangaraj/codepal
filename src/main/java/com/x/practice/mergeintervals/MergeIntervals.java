/**
 *
 */
package com.subrat.practice.mergeintervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MergeIntervals {
    public static ArrayList<Interval> merge(ArrayList<Interval> list) {
        Collections.sort(list, new Comparator<Interval>() {
            public int compare(Interval i1, Interval i2) {
                if (i1.lo == i2.lo) {
                    return i1.hi - i2.hi;
                }
                return i1.lo - i2.lo;
            }
        });
        System.out.println("Sorted Input: " + list);

        ArrayList<Interval> result = new ArrayList<Interval>();
        Interval prev = list.get(0);
                result.add(prev);
        for (int i = 1; i < list.size(); i++) {
            Interval current = list.get(i);
            if (prev.hi >= current.lo) {
                Interval interval = new Interval(prev.lo, Math.max(prev.hi, current.hi));
                prev = interval;
            } else {
                prev = current;
            }
            removeIfExist(result, prev);
            result.add(prev);
        }
        return result;
    }

    private static void removeIfExist(ArrayList<Interval> result, Interval prev) {
        if (result.size() > 0) {
            Interval existing = result.get(result.size() - 1);
            if (existing.lo == prev.lo) {
                result.remove(result.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Interval> list = new ArrayList<Interval>();
        list.add(new Interval(8, 10));
        list.add(new Interval(1, 3));
        list.add(new Interval(2, 6));
        list.add(new Interval(15, 18));
        System.out.println("Input: " + list);
        System.out.println("merged interval: " + merge(list));
        System.out.println("-----------------------------------------------------");
        list = new ArrayList<Interval>();
        list.add(new Interval(8, 10));
        list.add(new Interval(1, 3));
        list.add(new Interval(2, 6));
        list.add(new Interval(3, 9));
        list.add(new Interval(15, 18));
        System.out.println("Input: " + list);
        System.out.println("merged interval: " + merge(list));
        System.out.println("-----------------------------------------------------");
    }
}