import java.util.Arrays;

public class TaskOne{
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 7, 2, 2, 7, 8, 9};
        arrangeNums(nums);
    }

    public static void arrangeNums(int[] arr){

        for(int i=0; i< arr.length-1; i++){
            for(int j=0; j<arr.length -1-i; j++){
                if(arr[j + 1]%2==1 && arr[j]%2==0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}