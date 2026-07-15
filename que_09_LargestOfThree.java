
import java.util.Scanner;

public class que_09_LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();

        if(n>m && n>l){
            System.out.println("Largest Number is : " + n);
        }else if (m>n && m>l) {
            System.out.println("largest number is : " + m);
        }else{
            System.out.println("largest number is : " + l);
        }
    }
}
