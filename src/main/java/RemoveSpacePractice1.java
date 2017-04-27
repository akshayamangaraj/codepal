import java.util.Arrays;

/**
 *
 */

/**
 * @author sparid2
 *
 */
public class RemoveSpacePractice1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String string = "  Hi, how       are    you";
        RemoveSpacePractice1 removeSpace = new RemoveSpacePractice1();
        removeSpace.remove(string);

    }

    private void remove(String string) {
        char[] array = string.toCharArray();
        int noOfSpaces = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]== ' '){
                noOfSpaces = noOfSpaces+1;
            }else{
                array[i-noOfSpaces] = array[i];
            }
        }


        System.out.println(Arrays.copyOf(array, array.length-noOfSpaces));


    }

}
