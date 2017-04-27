/**
 *
 */
package com.subrat.hashmap.sorting;

import java.util.Comparator;

/**
 * @author sparid2
 *
 */
public class Employee implements Comparable<Employee>{

    private String firstNmae;
    private String lastName;
    private int age;
    private Double salary;

    public Employee(String firstName, String lastName, int age,Double salary){
        this.firstNmae = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstNmae() {
        return firstNmae;
    }
    public void setFirstNmae(String firstNmae) {
        this.firstNmae = firstNmae;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((firstNmae == null) ? 0 : firstNmae.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + ((salary == null) ? 0 : salary.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (age != other.age)
            return false;
        if (firstNmae == null) {
            if (other.firstNmae != null)
                return false;
        } else if (!firstNmae.equals(other.firstNmae))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        if (salary == null) {
            if (other.salary != null)
                return false;
        } else if (!salary.equals(other.salary))
            return false;
        return true;
    }



    @Override
    public String toString() {
        return "Employee [firstNmae=" + firstNmae + ", lastName=" + lastName + ", age=" + age + ", salary=" + salary
                + "]";
    }

    @Override
    public int compareTo(Employee o) {
        // TODO Auto-generated method stub
        return this.age - o.age;
    }

    public static final Comparator<Employee> comparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee o1, Employee o2) {
            // TODO Auto-generated method stub
            return (int) (o1.getSalary()-o2.getSalary());
        }
    };

}
