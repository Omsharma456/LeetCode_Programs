package Easy;

public class Jewels_and_stones {
    public static int jewelstones(String jewel, String stones) {
            int count=0;
            for (int i = 0; i < jewel.length(); i++) {
                char chr=jewel.charAt(i);
                for (int j = 0; j < stones.length(); j++) {
                    if (stones.charAt(j) == chr) {
                        count++;
                    }
                }
            }
            return count;
    }

    public static void main(String[] args) {
        String jewel="aA";
        String stones="aAAbbb";
        System.out.println(jewelstones(jewel,stones));
    }
}
