public class selationsort {
      
    public static void select(int arr[]){
        
        for(int i=0;i<arr.length-1;i++){
          int min=i;
       for(int j=i+1;j<arr.length;j++)
       {
        if(arr[j]<arr[min]){

            min=j;
        }
        int temp=arr[min];
        arr[min]=arr[i];
        arr[i]=temp;
       }
    }
    }
    public static void main(String[] args) {
          int arr[]={2,6,8,7,1};
          select(arr);
          System.out.println("Sorted array:");
          for (int num :arr){
              System.out.print(num+" ");
          }
    }
  

}
