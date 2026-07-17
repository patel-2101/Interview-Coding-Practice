
import java.util.*;

public class que_15_CheckAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st1 = sc.nextLine();
        String st2 = sc.nextLine();
        st1 = st1.toLowerCase();
        st2 = st2.toLowerCase();


        char[] ch1 = st1.toCharArray();
        Arrays.sort(ch1);

        String st3 = new String(ch1);



        char[] ch2 = st2.toCharArray();
        Arrays.sort(ch2);
        String st4 = new String(ch2);

        System.out.println(st3.equals(st4));

    }
}
