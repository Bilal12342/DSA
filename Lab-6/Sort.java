       public class Sort{

        public void SortingFour(int[] arr) {
           
            if (arr.length != 4) {
                System.out.println("Array must have exactly 4 elements");
                return;
            }
    
          
            if (arr[0] > arr[1]) {
                swap(arr, 0, 1);
            }
    
            
            if (arr[2] > arr[3]) {
                swap(arr, 2, 3);
            }
    
           
            if (arr[1] > arr[2]) {
              
                swap(arr, 1, 2);
               
                if (arr[1] > arr[3]) {
                    swap(arr, 1, 3);
                }
            } else {
                
                if (arr[2] > arr[3]) {
                    swap(arr, 2, 3);
                }
            }
        }
    
       
        private void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    
        public static void main(String[] args) {
            int[] arr = {4, 3, 2, 1};
            Sort sorter = new Sort();
            sorter.SortingFour(arr);

            System.out.print("Sorted array: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
     
