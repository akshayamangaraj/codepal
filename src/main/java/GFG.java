import java.util.ArrayList;
import java.util.Arrays;

class GFG {

    void unionintersection(int arr1[],int arr2[]){
      int len1=arr1.length;
      int len2=arr2.length;
      int combined=len1+len2;

      Arrays.sort(arr1);
      Arrays.sort(arr2);
      ArrayList<Integer> list = new ArrayList<Integer>();
       ArrayList<Integer> listintersect = new ArrayList<Integer>();


 for(int x=0;x<arr1.length;x++){

     list.add(arr1[x]);
 }
       int po=arr1.length;

      for(int x=0;x<arr2.length;x++){
         int pos =  Arrays.binarySearch(arr1,arr2[x]);
         if(pos<0){


          list.add(arr2[x]);

         }
         else{
             listintersect.add(arr2[x]);
         }

      }
      System.out.println("union");
       for(int y=0;y<list.size();y++){

           System.out.println(list.get(y));

       }
         System.out.println("intersection");
         for(int y=0;y<listintersect.size();y++){

            System.out.println(listintersect.get(y));

         }
    }
    public static void main (String[] args) {
        //code

        int arr1[] = {7, 1, 5, 2, 3, 6};
        int arr2[] = {3, 8, 6, 20, 7};
        GFG g = new GFG();
        g.unionintersection(arr1,arr2);

    }
}