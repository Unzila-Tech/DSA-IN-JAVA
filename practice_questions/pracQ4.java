package practice_questions;
import java.util.Scanner;

public class pracQ4 {

   public static void circle(int radius){

      float circumferance=2*(3.14f*radius);
      System.out.println("circumferance of circle:"+circumferance);
      return ;
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius =sc.nextInt();
       circle(radius);
       sc.close();
    }
}
