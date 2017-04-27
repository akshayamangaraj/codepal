/**
 *
 */

/**
 * @author sparid2
 *
 */
public class RemoveSpacePractice {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String sentencee = "Hi  How r     you";
        RemoveSpacePractice object = new RemoveSpacePractice();
        object.remove(sentencee);

    }

    private void remove(String sentencee) {
        char[] array1 = sentencee.toCharArray();
        char[] array2 = new char[sentencee.length()];

        int i=0;
        int j=0;

        while(i<sentencee.length()){
            if(array1[i]!= ' '){
                array2[j]=array1[i];
                j++;
            }
            i++;
        }

        System.out.println(array2);

    }

}
