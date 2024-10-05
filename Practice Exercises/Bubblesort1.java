import java.util.Scanner;
public class Bubblesort1 {
    public static void Sort(int arr[],int n){
     for (int i=0;i<n-1;i++){

        for (int j=0;j<n-i-1;j++){

         if(arr[j]>arr[j+1]){
         int temp=arr[j];
         arr[j]=arr[j+1];
         arr[j+1]=temp;
         }
        }
     }
    }
    public static void print(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
   public static void main(String[] args) {
    Scanner sr=new Scanner(System.in);
    System.out.println("Enter length of array");
    int n=sr.nextInt();
    System.out.println("Enter unsorted array");
    int arr[]=new int[n];
    for (int i=0; i<n;i++){
        arr[i]= sr.nextInt();
    }
        Sort(arr, n);
        print( arr );
   } 
}
