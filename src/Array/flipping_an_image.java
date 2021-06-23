package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

//flipping an image
// step1: flip image horizontally by reverse.
// step2: flip image invert by replace 1 to 0 and 0 to 1.
public class flipping_an_image{
    public static int[][] flip(int[][] array) {
        int[][] revArr=new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            int k=0;
            for (int j = array[0].length - 1; j >= 0; j--) {
                if (array[i][k] == 1) {
                    revArr[i][j] = 0;
                } else {
                    revArr[i][j]=1;
                }
                k++;
            }
        }
        return revArr;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
        flip(arr);
    }
}