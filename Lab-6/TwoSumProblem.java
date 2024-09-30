public class TwoSumProblem {

    public void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            
            mergeSort(arr, left, mid);
            
            mergeSort(arr, mid + 1, right);
            
         
            merge(arr, left, mid, right);
        }
    }
    public void merge(int[] arr, int left, int mid, int right) {
       
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

      
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public boolean TwoSum(int[] arr, int K) {
   
        mergeSort(arr, 0, arr.length - 1);  

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int sum = arr[left] + arr[right];

            if (sum == K) {
              
                if (left == right) {
                    if (left + 1 < arr.length && arr[left] == arr[left + 1]) {
                        return true;  
                    }
                } else {
                    return true;  
                }
            }

            if (sum < K) {
                left++;
            }
          
            else {
                right--;
            }
        }

  
        return false;
    }

    
    public static void main(String[] args) {
        TwoSumProblem tsp = new TwoSumProblem();

        int[] arr = {8, 4, 1, 6};
        int K = 10;

        if (tsp.TwoSum(arr, K)) {
            System.out.println("Yes, there are two numbers whose sum equals " + K);
        } else {
            System.out.println("No, there are no two numbers whose sum equals " + K);
        }
    }
}
