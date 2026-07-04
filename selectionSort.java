public class selectionSort{
    public static void printArray(int arr[]){
         System.out.println("sorted array:");
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
         }
         
    }
    public static void main(String[] args) {
         int arr[] = {7,8,3,1,2};
        int i,j;
       
       for(i=0;i<arr.length-1;i++){
        int smallest=i;
        for(j=i+1;j<arr.length;j++){
            if(arr[smallest]>arr[j]){
                smallest=j;
            }
        }
        int temp=arr[smallest];
        arr[smallest]=arr[i];
        arr[i]=temp;

       }
    printArray(arr);
    }
}