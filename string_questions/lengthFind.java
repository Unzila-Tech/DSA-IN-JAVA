package string_questions;
import java.util.Scanner;
public class lengthFind{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("enter size ");
         int size= sc.nextInt();

         String [] array=new String[size];
         int findcumlen=0;
         System.out.println("enter a string ");
        for(int i=0;i<size;i++){

              array[i]=sc.next();

              findcumlen+=array[i].length();
        }
        sc.close();
        System.out.println("Total length of String:" +findcumlen);
      
    }
}