/**
 *
 */
package com.subrat.comparatorpackage;

import java.util.Comparator;

/**
 * @author sparid2
 *
 */
public class NameComparator implements Comparator<Student>{

    public int compare(Student o1, Student o2) {
        // TODO Auto-generated method stub
        return o1.getName().compareTo(o2.getName());
    }

}
