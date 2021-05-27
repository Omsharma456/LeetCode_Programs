package Easy;

public class Number_of_good_pairs {
    public static int numOfPair(int[] array){
        int goodpair=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j] && i < j) {
                    goodpair++;
                }
            }
        }
        return goodpair;
    }

    public static void main(String[] args) {
        int[] array={1,2,3,1,1,3};
        System.out.println(numOfPair(array));
    }
}
