/**
 *
 */
package com.subrat.hashmap.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author sparid2
 *
 */
public class HMapSortingByvalues {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Employee e1 = new Employee("Subrat", "parida", 32,32434.876);
        Employee e2 = new Employee("Shakti", "parida", 29,76587.4);
        Employee e3 = new Employee("Reyansh", "parida", 1,546546.78);
        Employee e4 = new Employee("Dima", "Das", 25,8.88);
        Employee e5 = new Employee("Ahinsa", "parida", 37,8766.878);

        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        Collections.sort(list);

        for (Employee employee : list) {
            System.out.println(employee.getAge()+".."+employee.getFirstNmae()+"..."+employee.getLastName());
        }

        Collections.sort(list, Employee.comparator);
        for (Employee employee : list) {
            System.out.println(employee.getSalary());

        }


    }

}
