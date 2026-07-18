import java.util.Scanner;

public class que_02_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n<=1) {
            System.out.println("Not a prime number : ");
            return;
        }
        int org = n;
        for (int i = 2; i < n/2; i++) {
            if (n%i == 0) {
                System.out.println("Not a prime number  : " + org);
                return;
            }
        }

        System.out.println("Prime number : " + n);



        
    }
}
