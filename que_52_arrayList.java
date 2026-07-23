import java.util.Arrays;

public class que_52_arrayList {
    public static void main(String[] args) {

        int arr[][][] = {
            {
                {1, 2, 3, 4},
                {7, 8, 9, 5},
                {9, 3, 2, 8, 7, 2}
            }
        };

        System.out.println(Arrays.deepToString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}        





