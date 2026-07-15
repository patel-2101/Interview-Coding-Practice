
import java.util.Scanner;

public class que_06_PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int org = n;
        while (n !=0 ) {
            int num = n %10;
            rev = (10 * rev) + num;
            n = n/10;

        }
        System.out.println(org == rev);
    }
}
