/**
 *
 */
package com.subrat.run.length.encoding;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author sparid2
 *
 */
public class RunLengthEncodingPractice {

    public static String decode(String source) {
        StringBuffer dest = new StringBuffer();
        Pattern pattern = Pattern.compile("[0-9]+|[a-zA-Z]");
        Matcher matcher = pattern.matcher(source);
        while (matcher.find()) {
            int number = Integer.parseInt(matcher.group());
            matcher.find();
            while (number-- != 0) {
                dest.append(matcher.group());
            }
        }
        return dest.toString();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string :");
        RunLengthEncodingPractice runLengthEncodingPractice = new RunLengthEncodingPractice();
        runLengthEncodingPractice.encode(scanner.nextLine());
        String output = RunLengthEncodingPractice.decode("3a2b4c");
        System.out.println(output);


    }

    private void encode(String input) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < input.length(); i++) {
            int length = 1;
            while(i+1 < input.length() && input.charAt(i)== input.charAt(i+1)){
                length++;
                i++;
            }

            sb.append(length);
            sb.append(input.charAt(i));


        }
        System.out.println(sb.toString());

    }

}
