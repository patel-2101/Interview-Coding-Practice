
import java.util.Scanner;

public class que_07_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int org = n;
        int sum = 0;
        while (n != 0){
            int mum = n % 10;
            sum += mum*mum*mum;
            n = n/10;
        }
        System.out.println(sum == org);
    }
}
