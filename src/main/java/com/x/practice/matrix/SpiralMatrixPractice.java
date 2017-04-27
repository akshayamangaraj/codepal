/**
 *
 */
package com.subrat.practice.matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sparid2
 *
 */
public class SpiralMatrixPractice {

    private static List<Integer> circularForm(int[][] matrix){
        List<Integer> list = new ArrayList<>();
        int m = matrix.length;
        int n= matrix[0].length;
        int x=0;
        int y=0;

        while (m>0 && n>0){

            if(m==1){
                for(int i=0; i<n; i++){
                    list.add(matrix[x][y++]);
                }
                break;
            }else if(n==1){
                for(int i=0; i<m; i++){
                    list.add(matrix[x++][y]);
                }
                break;
            }

        for (int i = 0; i < n-1; i++) {
            list.add(matrix[x][y++]);
        }

        for (int i = 0; i < m-1; i++) {
            list.add(matrix[x++][y]);
        }

        for (int i = 0; i < n-1; i++) {
            list.add(matrix[x][y--]);
        }

        for (int i = 0; i < m-1; i++) {
            list.add(matrix[x--][y]);
        }
        x++;
        y++;
        m= m-2;
        n= n-2;
        }

        return list;



    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        SpiralMatrixPractice  spiralMatrixPractice = new SpiralMatrixPractice();
        int[][] matrix = new int[][]
                {
            {1,2,3},
            {4,5,6},
            {7,8,9}

                };



    }

}
