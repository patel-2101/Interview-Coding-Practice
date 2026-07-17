
import java.util.*;

public class que_41_BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int res = 0;
         while (n > 0) {
            int digit = n % 10;
            res += digit * (int)Math.pow(2, count);
            count++;
            n = n / 10;
        }


        System.out.println(res);
    }
}
