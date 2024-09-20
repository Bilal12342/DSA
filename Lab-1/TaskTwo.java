import java.util.Arrays;

public class TaskTwo {
    public static void main(String[] args) {
        int[] arr1d = new int[20];
        int[][] arr2d = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 }
        };

        noDup(arr2d, arr1d);

    }

    public static void noDup(int[][] arr2d, int[] arr1d) {

        int idx = 0;
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                boolean Bool = true;
                for (int check = 0; check < arr1d.length; check++) {
                    if (arr1d[check] == arr2d[i][j]) {
                        Bool = false;
                        break;
                    }
                }
                if (Bool)
                    arr1d[idx++] = arr2d[i][j];
            }
        }

        System.out.println(Arrays.toString(arr1d));

    }
}
