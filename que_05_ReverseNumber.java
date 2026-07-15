
import java.util.Scanner;

public class que_05_ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while (n !=0) {
            int num = n % 10;
            rev = (rev * 10 ) + num;

            n = n/10;
        }

        System.out.println(rev);

    }
}
