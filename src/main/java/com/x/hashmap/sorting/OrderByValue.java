/**
 *
 */
package com.subrat.hashmap.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author sparid2
 *
 */
public class OrderByValue {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("hjdgbfvjh", 675);
        map.put("gerg", 345);
        map.put("rhtrh", 12);
        map.put("yuhfyu", 89);
        map.put("dfgfg", 1);
        map.put("ertrt", 20);

        System.out.println("Before sorting the map....");
        //printMap(map);
        Set<Entry<String, Integer>> set = map.entrySet();
        List<Entry<String,Integer>> list = new ArrayList<>(set);

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey()+"====="+entry.getValue());
        }
    }

    private static void printMap(Map<String, Integer> map) {
        Map.Entry<String, Integer> map1 = (Entry<String, Integer>) map.entrySet();
        System.out.println("key is :"+map1.getKey()+" and value is :"+map1.getValue());

    }

}
