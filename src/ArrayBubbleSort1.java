import java.util.Arrays;

public class ArrayBubbleSort1 {
    //1.冒泡排序算法
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for (int i=0;i<n-1;i++){
            for (int j=0;j< n-1; j++){
                if (arr[j] >arr[j+1]){
                    //swap arr[j] and arr[j+1]
                    int temp=arr[j];
                    arr[j] = arr [j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //2.选择排序算法
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i=0;i<n-1;i++){
            //find the minimum element in remaining unsorted array
            int minIndex = i;
            for (int j=i+1;j<n;j++){
                //if currenent is smaller than the minimum element found so far
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            //swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    //3.插入排序算法
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for (int i=1;i<n;i++){
            int key = arr[i];     //key to be inserted
            int j = i-1;          //index of the last element in sorted subarray
            //find the correct position to insert the key in sorted subarray
            while (j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    //4.希尔排序算法
    public static void shellSort(int[] arr){
        int n = arr.length;
        int gap = n/2;
        while (gap>0){
            //do insertion sort for this gap
            for (int i=gap;i<n;i++){
                int key = arr[i];
                int j = i-gap;

                //find the correct position to insert the key in sorted subarray
                while (j>=0 && arr[j]>key){
                    arr[j+gap] = arr[j];
                    j -= gap;
                }
                arr[j+gap] = key;
            }
            //reduce the gap for the next iteration
            gap /= 2;
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {8, 9, 0, 2, 7, 4, 1, 6, 3, 10, 5};
        System.out.println("Before sorting: ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        bubbleSort(arr);
        System.out.println("\nAfter sorting: ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
