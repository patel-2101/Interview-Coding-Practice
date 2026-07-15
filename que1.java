
import java.util.Scanner;

public class que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%2==0) {
            System.out.println("Even Number : " + n);
        }
        else{
            System.out.println("Odd Number : " + n);
        }

        System.out.println("Thank You");
    }
}
