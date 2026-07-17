import java.util.Scanner;

public class que_43_StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int org = n;
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum += fact(digit);
            n /= 10;
        }

        System.out.println(org == sum);
        sc.close();
    }

    static int fact(int n) {
        int facts = 1;

        for (int i = 1; i <= n; i++) {
            facts *= i;
        }

        return facts;
    }
}