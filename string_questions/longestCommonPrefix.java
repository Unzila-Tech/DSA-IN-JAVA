package string_questions;
public class longestCommonPrefix {

    public static void LCP(String str[]){
        if(str.length==0){
          System.err.println("");
          return ;
        }
        String NewStr="";
        for(int i=0; i<str[0].length();i++){
            char ch=str[0].charAt(i);
            for(int j=1;j<str.length;j++){

                if(i>=str[j].length()|| str[j].charAt(i)!=ch){
                    System.out.println("Longest Common Prefix Are :"+NewStr);
                    return;
                }
            }
            NewStr+=ch;
        }
    System.out.println(NewStr);
    }
    public static void main(String[] args) {
        String [] str={"flower","flow","flight"};
        LCP(str);
    }
}
