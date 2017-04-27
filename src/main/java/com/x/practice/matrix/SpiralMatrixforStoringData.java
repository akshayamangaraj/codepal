/**
 *
 */
package com.subrat.practice.matrix;

/**
 * @author sparid2
 *
 */
public class SpiralMatrixforStoringData {


    private static int[][] generateMatrix(int n) {
        int total = n*n;
        int[][] result= new int[n][n];

        int x=0;
        int y=0;
        int step = 0;

        for(int i=0;i<total;){
            while(y+step<n){
                i++;
                result[x][y]=i;
                y++;

            }
            y--;
            x++;

            while(x+step<n){
                i++;
                result[x][y]=i;
                x++;
            }
            x--;
            y--;

            while(y>=0+step){
                i++;
                result[x][y]=i;
                y--;
            }
            y++;
            x--;
            step++;

            while(x>=0+step){
                i++;
                result[x][y]=i;
                x--;
            }
            x++;
            y++;
        }

        return result;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        SpiralMatrixforStoringData obj = new SpiralMatrixforStoringData();
        int[][] array = obj.generateMatrix(4);

    }

}
