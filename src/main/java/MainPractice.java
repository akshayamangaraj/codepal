import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 */

/**
 * @author sparid2
 *
 */
public class MainPractice {

    private static BufferedReader br = null;
    private FileReader fr = null;
    private static Set<Entries> set = new TreeSet<>(new MyComparision());

    static class Entries{
        private int length;
        private String line;

        public Entries(int length, String line){
            this.length = length;
            this.line = line;
        }
    }

    static class MyComparision implements Comparator<Entries>{

        @Override
        public int compare(Entries o1, Entries o2) {

            return o2.length-o1.length;
        }

    }

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the file path");
        String path = scanner.next();
        int count = 0;
        try {
            br = new BufferedReader(new FileReader(new File(path)));
            String line = br.readLine();
            int top = Integer.parseInt(line.trim());
            while((line = br.readLine())!=null){
                line = line.trim();
                        if(!"".equals(line)){
                            set.add(new Entries(line.length(), line));
                        }
            }
            for (Entries entries : set) {
                System.out.println(entries.line);
                if(++count == top){
                    break;
                }
            }
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }



    }

}
