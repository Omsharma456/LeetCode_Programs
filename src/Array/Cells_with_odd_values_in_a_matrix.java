package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Cells_with_odd_values_in_a_matrix {
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < indices[i].length; j++) {
                int a=indices[i][j];
                if (j < 1) {
                    for (int row = 0; row < arr[0].length; row++) {
                        arr[a][row]++;
                    }
                } else {
                    for (int col = 0; col < arr.length; col++) {
                        arr[col][a]++;
                    }
                }
            }
        }
       int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] arr = {{0, 1}, {1, 1}};
        System.out.println(oddCells(2,3,arr));
    }
}
