import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input size of array
        System.out.println("enter a size of array");
        int size = sc.nextInt();
        int [] array= new int[size];
        //input array
        System.out.println("enter a number of array");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        //search a x index no.
        System.out.println("enter a value x to find its index");
        int x=sc.nextInt();
        //print a number of index
       for(int i=0;i<array.length;i++){
                if(array[i]==x){
                  System.out.println("index number are:"+i);
                }     
          }
       sc.close();
    }
}
