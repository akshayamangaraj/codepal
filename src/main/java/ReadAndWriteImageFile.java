import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 */

/**
 * @author sparid2
 *
 */
public class ReadAndWriteImageFile {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        try {
            File file = new File("C:\\Users\\sparid2\\Desktop\\Mili.png");
            FileInputStream fis = new FileInputStream(file);
            byte[] b = new byte[(int) file.length()];
            fis.read(b);
            System.out.println(b);
            FileOutputStream fos = new FileOutputStream("C:\\Users\\sparid2\\Desktop\\Mili2.png");
            fos.write(b);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
