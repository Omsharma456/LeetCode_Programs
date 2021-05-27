package Easy;

import java.util.LinkedList;

public class Kids_with_greatest_number_of_candies {
    public static void Candies(int[] candies, int extracandies) {
        int max=0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max=candies[i];
            }
        }
        LinkedList<Boolean> list=new LinkedList<Boolean>();
        for (int j = 0; j < candies.length; j++) {
            int total=candies[j]+extracandies;
            if (total >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        Candies(candies,1);

    }
}
