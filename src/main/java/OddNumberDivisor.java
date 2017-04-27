import java.util.*;
import java.lang.*;
import java.io.*;

public class OddNumberDivisor {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int no = sc.nextInt();
        int counter = 0;
        if(no>0){
            for(int i=1;i<=no;i++){
               if(no%i==0){
                   counter++;
               }
            }
        }
        if(counter%2==1){
            System.out.println("This no has "+counter+" devisor");
        }else{
            System.out.println("this no doesn't have a odd number of divisor");
        }
    }
}