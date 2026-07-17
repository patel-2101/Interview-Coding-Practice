
import java.util.Scanner;

public class que_14_ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int s=  str.length()-1;

        String res = "";
        while (s>=0) {
            res += str.charAt(s);
            s--;
        }
        System.out.println(res);
    }
}
