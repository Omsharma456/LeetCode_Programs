package Easy;

public class Numbers_of_steps_to_reduce_a_number_to_Zero {
    public static int numberOfSteps(int num) {
        int count=0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
                count++;
            } else {
                num-=1;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
}
