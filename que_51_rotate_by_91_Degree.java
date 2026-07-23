
import java.util.Scanner;

public class que_51_rotate_by_91_Degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int arr[][] = new int[row][col];

        // input the matrix 


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Transpose of matrix 

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // reverse of matrix

        for (int i = 0; i < arr.length; i++) {
            int low = 0;
            int high = arr[0].length-1;

            while (low<high) {
                int temp = arr[i][low];
                arr[i][low] = arr[i][high];
                arr[i][high] = temp;

                low++;
                high--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();


    }
}
