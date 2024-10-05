public class Mergesort {

    public static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;    
        int j = mid + 1; 
        int k = left;   

    
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= right) {
            temp[k] = arr[j];
            j++;
            k++;
        }

       
        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }
    }

    
    public static void mergeSort(int[] arr, int[] temp, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

           
            mergeSort(arr, temp, left, mid);
            mergeSort(arr, temp, mid + 1, right);

         
            merge(arr, temp, left, mid, right);
        }
    }

  
    public static void sort(int[] arr) {
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);
    }

      public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7 ,3};
        System.out.println("Given Array:");
        printArray(arr);

        sort(arr);

        System.out.println("\nSorted Array:");
        printArray(arr);
    }


    public static void printArray(int[] arr) {
        for (int i:arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

