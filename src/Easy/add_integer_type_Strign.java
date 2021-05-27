package Easy;

public class add_integer_type_Strign {
    static void addString(String a, String b) {
        long sum1=0;
        long sum2=0;
        sum1 = StringToInt(a);
        sum2 += StringToInt(b);
        System.out.println(sum2);

    }

    static long StringToInt(String s) {
        long sum=0;
        int j=0;
        for (int i=s.length()-1; i>=0; i--){
            sum += ((s.charAt(j) - '0') * Math.pow(10, i));
            j++;
        }
        return sum;
    }
    public static void main(String[] args) {
        addString("10","20");

    }
}
