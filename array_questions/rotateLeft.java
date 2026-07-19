package array_questions;
import java.util.Scanner;
public class rotateLeft {
    
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("enter an array size");
        size=sc.nextInt();
        int [] array=new int [size];
        System.out.println("enter an array elements");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        int temp=array[0];
        for(int i=0;i<size-1;i++){
              array[i]=array[i+1];
        }
        array[size-1]=temp;
        System.out.println("After rotating left by One");
        for(int k=0;k<size;k++){
            System.out.print(array[k]+" ");
        }
        sc.close();
    }
}
