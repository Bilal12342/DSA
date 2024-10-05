public class Arr {
    public static void sort(int arr[]){
        for (int i=0;i<arr.length;i++){
         int min = i;
        for (int j=i+1; j<arr.length;j++){
            if (arr[j] < arr[min]){
           min=j;
            }
        }
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
        
    }
    }
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        sort(arr);
        System.out.println("Sorted array:");
        for (int num :arr){
            System.out.print(num+" ");
        }
    }
}
