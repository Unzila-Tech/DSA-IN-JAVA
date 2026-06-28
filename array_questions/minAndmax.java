package array_questions;

import java.util.Scanner;

public class minAndmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of array");
        int size=sc.nextInt();
        int []arr=new int[size];
        //input
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
  //constant min and max values assign
       int max =Integer.MIN_VALUE;
       int min= Integer.MAX_VALUE;
 

 // check min & max value
       for(int i=0;i<arr.length;i++){
           if(arr[i]<min){
             min=arr[i];
           }
           if(arr[i]>max){
             max=arr[i];
           }
       }

        System.out.println("minimum value:"+min);
        System.out.println("maximum value:"+max);
        sc.close();
    }
}
