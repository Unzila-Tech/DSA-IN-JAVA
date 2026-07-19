package Pattern_questions;
public class pattern1 {

//output 
//*****
//*****
//*****
//*****
    public static void main(String[] args) {
        int m=4;
        int n=5;
        //outer loop
        for(int row=1;row<=m; row++){
        //inner loop
            for(int col=1;col<=n;col++){
            System.out.print("*");
            }
           System.out.println();
        }
    }
}
