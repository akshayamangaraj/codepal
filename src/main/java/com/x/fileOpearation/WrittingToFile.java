/**
 *
 */
package com.subrat.fileOpearation;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author sparid2
 *
 */
public class WrittingToFile {

    public static void main(String[] args) {

        try {
            StringBuilder sb = new StringBuilder();
            sb.append("something");
            PrintWriter pw = new PrintWriter(new FileWriter("C:\\Dev\\Testing\\testingforwritting.txt"));
            pw.println(sb.toString());//write(sb.toString());
            System.out.println("printing successfull");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
