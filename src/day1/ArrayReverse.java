package day1;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        reverseArray2(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    //AI write this method
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Swap the elements at start and end
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move towards the middle
            start++;
            end--;
        }
    }

    //I write this method to reverse the array using a for loop
    public static void reverseArray2(int[] array) {
        int len = array.length;

        for (int x = 0; x < len/2; x++) {
            // Swap the elements at start and end
            int temp = array[x];
            array[x] = array[len-1-x];
            array[len-1-x] = temp;
        }
    }
}
