public class Insersionsort {  
        public static void insertionSort(int[] arr) {
            int n = arr.length,key;

            for (int i = 1; i < n; i++) {
                 key = arr[i]; 
                
                int j = i - 1;
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = key; 
            }
          
        }
     
    
        public static void main(String[] args) {
            int[] arr = {12, 11, 13, 5, 6};
            insertionSort(arr);
        
            System.out.println("Sorted array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
    

