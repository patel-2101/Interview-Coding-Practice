import java.util.Scanner;

public class que_03_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        while(n != 0){
            fact *= n;
            n = n-1;
        }
        System.out.println(fact);
    }
}
