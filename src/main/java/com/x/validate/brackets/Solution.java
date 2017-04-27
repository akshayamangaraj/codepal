/**
 *
 */
package com.x.validate.brackets;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

class Parser {
    private static final Map<Character, Character> brackets = new HashMap<Character, Character>();

    static {
        brackets.put('[', ']');
        brackets.put('{', '}');
        brackets.put('(', ')');
    }

    boolean checkParenthesesBalance(String str) {
        if (str.length() == 0) {
            throw new IllegalArgumentException("String length should be greater than 0");
        }
        // odd number would always result in false
        if ((str.length() % 2) != 0) {
            return false;
        }

        final Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            if (brackets.containsKey(str.charAt(i))) {
                stack.push(str.charAt(i));
            } else if (stack.empty() || (str.charAt(i) != brackets.get(stack.pop()))) {
                return false;
            }
        }
        return true;
    }
}

class Solution {

    public static void main(String[] argh) {
        Parser X = new Parser();
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            System.out.println(X.checkParenthesesBalance(in.next()));
        }

    }
}
