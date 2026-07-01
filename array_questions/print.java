package array_questions;

import java.util.Scanner;

public class print {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("enter an array size");
       //input size
       int size=sc.nextInt();
       String [] names=new String[size];
       //input array
       for(int i=0; i<size; i++){
          names[i]=sc.nextLine();
       }
     //output
     for(int i=0;i<names.length;i++){
        System.out.println(names[i]+" ");
       }
       sc.close();
     }
}
