package array_questions;

public class secondLargest {
    public static void main(String[] args) {
        int i;
        int largest = 0, secondLargest = 0;

        int[] arr = { 1, 10, 9, 7 };
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {

                secondLargest = arr[i];
            }
        }
        System.out.println("SecondLargest element of an array: " + secondLargest);

    }
}
