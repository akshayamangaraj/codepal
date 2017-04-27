/**
 *
 */
package com.subrat.run.length.encoding;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author sparid2
 *
 */
public class RunLengthEncodingPractice1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        RunLengthEncodingPractice1 object = new RunLengthEncodingPractice1();
        object.encode("aaabbcc");
        object.decode("3a2b");

    }

    private void decode(String string) {
        StringBuilder sb = new StringBuilder();
        Pattern pattern = Pattern.compile("[0-9]+|[a-zA-Z]");
        Matcher matcher = pattern.matcher(string);
        while(matcher.find()){
            Integer no = Integer.parseInt(matcher.group());
            matcher.find();
            while(no--!=0){
                sb.append(matcher.group());
            }
        }
        System.out.println(sb.toString());

    }

    private void encode(String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            int length=1;
            while(i+1 < string.length() && string.charAt(i)==string.charAt(i+1)){
                length++;
                i++;
            }
            sb.append(length);
            sb.append(string.charAt(i));
        }

        System.out.println(sb.toString());

    }

}
