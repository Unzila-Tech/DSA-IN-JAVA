import java.util.Scanner;

public class pracQ1 {

    public static void printAverage(int num1,int num2, int num3){
        int sum= num1+num2+num3;
        int average=sum/3;
        System.out.println("Total number of average:"+average);
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a numbers");
         int num1 =sc.nextInt();
          int num2 =sc.nextInt();
           int num3 =sc.nextInt();
         sc.close();
         printAverage(num1, num2, num3);
    }
}
