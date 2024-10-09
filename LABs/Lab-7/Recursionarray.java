public class Recursionarray {
    public static void AssenArray(int arr[], int index) {
        if (index == arr.length) {
            return;
        }
        System.out.print(arr[index] + " "); 
        AssenArray(arr, index + 1); 
    }
    public static void disasernArray(int arr[], int index) {
        if (index < 0) {
            return; 
        }
        System.out.print(arr[index] + " "); 
        disasernArray(arr, index - 1); 
    }
    public static void main(String[] args) {
        int arr[] = {4, 6, 7, 8, 9, 65, 3};
        System.out.println("Ascending order:");
        AssenArray(arr, 0); 
        System.out.println("\nDescending order:");
        disasernArray(arr, arr.length - 1); 
    }
}
