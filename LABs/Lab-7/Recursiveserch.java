
    public class Recursiveserch {
        public static int recursiveSearch(int[] arr, int searchValue, int index) {
            if (index >= arr.length) {
                return 0;  
            }
            if (arr[index] == searchValue) {
                return 1;
            }
            return recursiveSearch(arr, searchValue, index + 1);  // Recursive call
        }
    
}
