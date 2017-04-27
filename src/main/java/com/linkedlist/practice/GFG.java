package com.linkedlist.practice;

import java.util.Scanner;






class GFG {
    public static void main (String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the line");
        String input = sc.nextLine();
        String newName = "";
        if(input !=null && input.length()>0){
        //If(!StringUtil.isEmpty(input)){
          /*String[] str = input.split(" ");
          for(String string : str){
              sb.append(string);
          }*/
            newName = input.replaceAll("\\s", "");
        }

        System.out.println(newName);
    }
}