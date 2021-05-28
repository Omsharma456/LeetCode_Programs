package Easy;

public class Subtract_the_product_and_sum_of_digits_of_an_integer {
    public static int subtractProductAndSum(int n){
        int sum=0;
        int product=1;
        while (n != 0) {
            int digit = n % 10;
            sum+=digit;
            product*=digit;
            n/=10;
        }
        return product-sum;
    }

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(4421));
    }
}
