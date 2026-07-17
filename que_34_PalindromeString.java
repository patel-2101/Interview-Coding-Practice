
import java.util.Scanner;

public class que_34_PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int low = 0;
        int high = s.length()-1;
        boolean ans = true;

        while (low<=high) {
            if (s.charAt(low) != s.charAt(high)) {
                ans = false;
            }
            low++;
            high--;
        }

        System.out.println(ans);

    }
}
