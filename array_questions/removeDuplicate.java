package array_questions;

import java.util.Scanner;

public class removeDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("enter an array size");
        size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("enter an array elements");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int i = 0, j;
        for (j = 0; j < size; j++) {
            if (array[i] != array[j]) {
                i++;
            }
            array[i] = array[j];

        }
        System.out.println("After removing array");

        for (int k = 0; k <= i; k++) {
            System.out.print(array[k] + " ");
        }
        sc.close();
    }
}
