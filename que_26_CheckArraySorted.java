
import java.util.Scanner;

public class que_26_CheckArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean ans = true;
        for (int i = 0; i < n-1; i++) {
            if (arr[i]>arr[i+1]) {
                // System.out.println("Not sorted array ");
                ans = false;
                break;
            }
        }

        System.out.println(ans ?  "Sorted array" : "Unsorted");
    }
}
