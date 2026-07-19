public class numberPyramid {
    public static void main(String[] args) {
        int m=5;
        int num=1;
        for(int i=1;i<=m;i++){
            for(int j=1; j<=m-i-1; j++){

            System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
               
            }
             num++;
            System.out.println();
        }
        
    }
}
