/**
 *
 */

/**
 * @author sparid2
 *
 */
public class TowersOfHanoi {

    private void move(int i, char from, char to, char inter) {

        if(i==1){
            System.out.println("Moving disks 1 from "+from+" to "+to);
        }else{
        move(i-1, from, inter, to);
        System.out.println("Moving disc "+i+" from "+from+" to "+to);
        move(i-1,inter, to, from);
        }

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        TowersOfHanoi obj = new TowersOfHanoi();
        obj.move(3,'A','C','B');

    }



}
