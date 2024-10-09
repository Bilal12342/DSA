public class Mergesort {
    public static void councure(int arr[],int mid ,int si,int en){
        int merg[]=new int[en-si+1];
        int idx1=si;
        int idx2=mid+1;
        int x=0;
        
            while (idx1<=mid&&idx2<=en) {
               if(arr[idx1]<=arr[idx2++]){
                merg[x++]=arr[idx1++];  
        }
        else{

            merg[x++]=arr[idx2++];  
        }
        while (idx1<=mid) {
            merg[x++]=arr[idx1++];
           }
           while (idx2<=en) {
            merg[x++]=arr[idx2++];
           }
           for(int i=0,j=si;i<merg.length;i++,j++){
            arr[j] = merg[i];
           }
    }
    }
    public static void divide(int arr[],int si,int en){
        if(si>=en){
            return;
        }
    int mid=si+(en-si)/2;
    divide(arr, si, mid);
    divide(arr, mid+1,en);
    councure(arr,  mid , si , en);
    }
    public static void main(String[] args) {
        int arr[]={6,8,3,2,4,6,9};
        int length=arr.length;
        divide(arr, 0, length-1);
        for(int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
     }
     }

