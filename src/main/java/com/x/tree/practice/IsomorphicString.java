/**
 *
 */
package com.subrat.tree.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sparid2
 *
 */
public class IsomorphicString {

    private static boolean isIsomorphic(String s1, String s2){

        Map<Character,Character> map = new HashMap<>();
        if(s1.length()!=s2.length())
            return false;

        if(s1==null || s2==null)
            return false;

        if(s1.length()==0 && s2.length()==0)
            return true;

        for (int i = 0; i < s1.length(); i++) {
            if(map.containsKey(s1.charAt(i))){

                 if(map.get(s1.charAt(i)) != s2.charAt(i)) {
                    return false;
                 }

            }else{
                map.put(s1.charAt(i), s2.charAt(i));
            }
        }


        return true;

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        boolean flag = isIsomorphic("abb", "gdd");
        System.out.println(flag);

    }

}
