
import java.util.Scanner;

public class que_18_LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("nter the target : ");
        int t = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == t) {
                System.out.println("Index is : " + i + "Data is : " + arr[i]);
            }
        }


    }
}
