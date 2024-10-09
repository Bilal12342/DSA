
    
    import java.util.Random;
import java.util.Scanner;
public class Itreativeserch {

    public static int iterativeSearch(int[] arr, int searchValue) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchValue) {
                return 1;  
            }
        }
        return 0;  
    }
}



