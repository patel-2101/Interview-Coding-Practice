
import java.util.Scanner;

public class que_40_DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // ArrayList<Integer> ans = new ArrayList<>();
        String bin = "";

        while (n >0) {
            bin = (n %2) + bin;
            n = n/2;
        }
        System.out.println(bin);
    }
}
