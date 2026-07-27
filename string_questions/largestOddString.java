package string_questions;

public class largestOddString {
     
    public static String OddNum(String num){
         
        for(int i=num.length()-1;i>=0;i--){

            char ch=num.charAt(i);
            if((ch-'0')%2!=0){
                return num.substring(0,i+1);
            }
        }
        return"";

    }
    public static void main(String[] args) {
        String num ="0214638";
        System.out.println(OddNum(num));
    }
}
