/**
 *
 */
package com.subrat.comparatorpackage;

import java.util.Comparator;

/**
 * @author sparid2
 *
 */
public class GradeComparator implements Comparator<Student>{

    public  int compare(Student o1, Student o2) {

        return o1.getGrade() - o2.getGrade();
    }

}
