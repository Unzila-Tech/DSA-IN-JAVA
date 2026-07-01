package string_questions;

import java.util.Scanner;

public class replace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String:");
        String name=sc.next();

        String result="";
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)=='e'){
                result+='i';
            }else{
                result+=name.charAt(i);
            }
        }
        sc.close();
        System.out.println("after replacing:"+ result);

    }
}
