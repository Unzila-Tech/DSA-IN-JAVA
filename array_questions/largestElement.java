package array_questions;

public class largestElement {
    public static void main(String[] args) {
        int i;
        int largest = 0;
        int[] arr = { 1, 10, 9, 7 };
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("largest element of an array: " + largest);
    }
}
