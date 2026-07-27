package string_questions;

public class reverseWords {
    public static void Reverse(String s){
          char [] ch=s.toCharArray();
          int left=0;
          int right=s.length()-1;
          while(left<right){
             char temp=ch[left];
             ch[left]=ch[right];
             ch[right]=temp;
          left++;
          right--;

          }
          
          System.out.println(new String(ch));
    }
    public static void palindromeCheck(String s){
          int left=0;
          int right=s.length()-1;
          boolean ispalindrome =true;
          while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                  ispalindrome=false;
                  break;
            }
            left++;
            right--;
          }
          if(ispalindrome){
            System.out.println("String are palindrome");
          }else{
            System.out.println("String are not palindrome");
          }
    }
    public static void main(String[] args) {
        String s="naman";
        Reverse(s);
        palindromeCheck(s);
    }
}
