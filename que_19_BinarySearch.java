import java.util.Scanner;

public class que_19_BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        // Input sorted array
        int[] arr = new int[n];
        System.out.println("Enter the sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input target
        System.out.print("Target: ");
        int t = sc.nextInt();

        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == t) {
                System.out.println("Element found at index: " + mid);
                sc.close();
                return;
            } else if (arr[mid] < t) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Element not found.");

    }
}