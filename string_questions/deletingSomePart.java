package string_questions;

import java.util.Scanner;

public class deletingSomePart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an email");
        String email=sc.next();
        String  username="";
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            }else{
                username+=email.charAt(i);
            }
        }
        sc.close();
        System.out.println("username are:"+username);
    }
}
