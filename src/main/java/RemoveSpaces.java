public class RemoveSpaces {

    public static void main(String[] args) {

        RemoveSpaces.removeSpaces("kjhkj hkjhkj kh                   jhjh                 klljkjklj");

    }

    public static void removeSpaces(String s1) {

        char stringArray[] = s1.toCharArray();

        char temp[] = new char[s1.length()];

        int i = 0;

        int j = 0;

        while (i < stringArray.length) {

            if (stringArray[i] != ' ') {

                temp[j] = stringArray[i];

                j++;

            }

            i++;

        }

        System.out.print(temp);

    }

}