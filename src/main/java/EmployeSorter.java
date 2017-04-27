import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import org.testng.collections.CollectionUtils;

/**
 *
 */

/**
 * @author sparid2
 *
 */
public class EmployeSorter {

    private static Employee[] employees;

    public EmployeSorter(int size) {
        this.employees = new Employee[size];

    }

    private static void sort(Employee[] obj){

        Comparator<Employee> comparator = new Comparator<Employee>() {

            public int compare(Employee o1, Employee o2) {
                // TODO Auto-generated method stub
                return o2.getEmpNo()>o1.getEmpNo()? 1 : -1;
            }
        };

        Collections.sort(Arrays.asList(obj), comparator);
        for (Employee employee : obj) {
            System.out.println(employee.getEmpNo());
        }


    }

    private static void insertsionSort(){

        for (int i = 0; i < employees.length; i++) {
            Employee current = employees[i];
            int j = i-1;
            while (j >=0 && employees[j].getEmpNo() >= current.getEmpNo()) {
                employees[j+1] = employees[j];
                j--;
            }
            employees[j+1] = current;
        }
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Employee o1 = new Employee();
        Employee o2 = new Employee();
        Employee o3 = new Employee();
        Employee o4 = new Employee();
        o4.setEmpNo(1213);
        o1.setEmpNo(567567);
        o2.setEmpNo(4655467);
        o3.setEmpNo(1213);

        //Employee[] obj = new Employee[]{o1,o2,o3};
        EmployeSorter sorter = new EmployeSorter(4);
        sorter.employees[0]=o1;
        sorter.employees[1]=o2;
        sorter.employees[2]=o3;
        sorter.employees[3]=o4;
        sorter.insertsionSort();

    }

}
