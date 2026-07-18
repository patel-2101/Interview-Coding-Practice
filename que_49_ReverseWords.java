
import java.util.Scanner;

public class que_49_ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentense = sc.nextLine();

        String[] str = sentense.split(" ");

        for (int i = str.length-1; i > 0; i--) {
            System.out.print(str[i] + " ");
        }
    }
}
