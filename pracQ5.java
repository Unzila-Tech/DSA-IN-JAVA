import java.util.Scanner;

public class pracQ5 {

     public static  void vote(int age){
          if(age>=18){
            System.out.println("Eligible for vote");
          }
          else{
            System.out.println("Not eligible for vote");
          }
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age =sc.nextInt();
        sc.close();
        vote(age);
    }
}
