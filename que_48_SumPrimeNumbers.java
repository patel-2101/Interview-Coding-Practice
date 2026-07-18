import java.util.Scanner;

public class que_48_SumPrimeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        System.out.println(sum);
    }

    static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}