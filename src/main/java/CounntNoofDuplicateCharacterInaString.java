/**
 *
 */

/**
 * @author sparid2
 *
 */
public class CounntNoofDuplicateCharacterInaString {

    /**
     * @param args
     */
    public static void main(String[] args) {
        CounntNoofDuplicateCharacterInaString object = new CounntNoofDuplicateCharacterInaString();
        object.findDuplicateCharacters("asdf23123sfsdf");

    }

    private void findDuplicateCharacters(String string) {
        char[] name = string.toCharArray();
        int count = 0, len = 0;
        do {
            try {

                len = name.length;
                count = 0;
                for (int j = 0; j < len; j++) {
                    if ((name[0] == name[j]) && ((name[0] >= 65 && name[0] <= 91) || (name[0] >= 97 && name[0] <= 123)))
                        count++;
                }
                if (count != 0)
                    System.out.println(name[0] + " " + count + " Times");
                string = string.replace(""+name[0], "");
            } catch (Exception ex) {
            }
        } while (len != 1);
    }

}
