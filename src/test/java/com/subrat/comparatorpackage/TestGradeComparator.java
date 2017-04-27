package com.subrat.comparatorpackage;

import java.util.Arrays;

import org.testng.annotations.Test;

public class TestGradeComparator {

  @Test
  public void TestGradeOfStudent() {

      Student [] student = new Student[3];
      student[0] = new Student(4, "Subrat");
      student[1] = new Student(3, "Shakti");
      student[2] = new Student(1, "Reyansh");
      System.out.println("Order os students before sorting is :");
      for (Student studentObject : student) {
          System.out.println(studentObject.getName()+" : "+studentObject.getGrade());

    }

      Arrays.sort(student, new GradeComparator());
      Arrays.sort(student, new NameComparator());
      System.out.println("Order os students after sorting is :");
      for (Student studentOtherObject : student) {
          System.out.println(studentOtherObject.getName()+" : "+studentOtherObject.getGrade());

    }
  }
}
