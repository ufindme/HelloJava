import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {8,2,5,1,7,3,6,4,9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

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
}