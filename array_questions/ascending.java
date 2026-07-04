package array_questions;

import java.util.Scanner;

public class ascending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter an array size");
        int size = sc.nextInt();
        int []number = new int[size];
        System.out.println("enter an array number");
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        boolean ascending=true;
        for(int i=0;i<number.length-1;i++){
            if(number[i]>number[i+1]){
                ascending=false;
            }
        }
        if(ascending){
            System.out.println("number are ascending!!");
        }else{
            System.out.println("number are not ascending!!");
        sc.close();
        }
        sc.close();
    }
}

