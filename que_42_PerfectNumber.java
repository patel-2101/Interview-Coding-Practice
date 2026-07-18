
import java.util.Scanner;

public class que_42_PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int s = 0;

        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0 ){
                s += i;
            }
        }
        if(n == s){
            System.out.println("Perfect Number  ");
        }else{
            System.out.println("Not a perfect number ");
        }
    }
}
