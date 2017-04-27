package com.subrat.ge.test;

import java.util.Stack;

class Solution {
    public int solution(String S) {

        Stack stack = new Stack();

        String[] string = S.split(" ");
        for (int i = 0; i < string.length; i++) {
            String value = string[i];
            stack.push(value);
            if (value.equals("DUP")) {
                stack.push(stack.peek());
            } else if (value.equals("POP")) {
                stack.pop();
            } else if (value.equals("+")) {
                int value1 = (int) stack.pop();
                int value2 = (int) stack.pop();
                int finalValue = value1 + value2;
                stack.push(finalValue);
            } else if (value.equals("-")) {
                int value1 = (int) stack.pop();
                int value2 = (int) stack.pop();
                int finalValue = value1 - value2;
                stack.push(finalValue);
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution("13 DUP 4 POP 5 DUP + DUP + -");
    }
}
