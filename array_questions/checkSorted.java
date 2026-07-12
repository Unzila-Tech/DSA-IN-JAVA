package array_questions;
import java.util.Scanner;

public class checkSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("enter an array size");
        size=sc.nextInt();
        int [] elements= new int[size];
        System.out.println("enter an elements!!");
        for(int i=0;i<size;i++){
            elements[i]=sc.nextInt();
        }
        boolean sorted=true;
        for(int i=0; i<size-1;i++){
            if(elements[i]>elements[i+1]){
               sorted=false;
            }
        }
        if(sorted){
            System.out.println("elements are sorted!");
        }else{
            System.out.println("elements could not sort!");
        }
        sc.close();
    }
}
