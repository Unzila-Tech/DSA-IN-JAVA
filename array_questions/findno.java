package array_questions;

import java.util.Scanner;

public class findno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter an  array size");
        // int size=sc.nextInt();
        int [][] arr=new int[3][4];
        System.out.println("enter an array element ");
        for(int row=0;row<3;row++){
            for(int col=0; col<4; col++){
                arr[row][col]=sc.nextInt();
            }
        }
        int x;
        System.out.println("enter finding value");
        x=sc.nextInt();
        for(int row=0;row<3;row++){
            for(int col=0; col<4; col++){
                if(x==arr[row][col]){
                    System.out.println("the index no. are:"+arr[row][col]);
                }
            }
        }
    }
}
