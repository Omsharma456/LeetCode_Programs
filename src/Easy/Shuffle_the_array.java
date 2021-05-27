package Easy;

import java.util.LinkedList;

public class Shuffle_the_array {
    public static void shuffle(int[] array, int n) {
        int len=array.length;
        int[] newarray=new int[len];
        int j=0;
        for (int i = 0; i < len; i += 2) {
            newarray[i]=array[j];
            j++;
        }
        int l=n;
        for (int k = 1; k < len; k += 2) {
            newarray[k]=array[l];
            l++;
        }
        for (int res : newarray) {
            System.out.print(res+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,3,2,1};
        shuffle(arr, 4);
    }
}
