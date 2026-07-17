
import java.util.*;

public class que_30_RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                continue;
            }
            else{
                res += s.charAt(i);
            }
        }
        System.out.println(res);
    }
}
