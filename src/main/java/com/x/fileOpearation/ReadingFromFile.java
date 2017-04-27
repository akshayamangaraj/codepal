/**
 *
 */
package com.subrat.fileOpearation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author sparid2
 *
 */
public class ReadingFromFile {

    public static void main(String[] args) {

        FileReader fileReader = null;
        BufferedReader br = null;

        try {
            fileReader = new FileReader("C:\\Dev\\Testing\\testing.txt");
             br = new BufferedReader(fileReader);
            String line = "";
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine())!=null) {
                sb.append(line);
                System.out.println(sb);

            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            if(fileReader!=null){
                try {
                    fileReader.close();
                }

                catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }



    }


}
