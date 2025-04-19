package day1;

public class ArraySortDemo {
    public static void main(String[] args) {
        int[] arr = {8, 9, 0, 2, 7, 4, 1, 6, 3, 10, 5};
        System.out.println("\nBefore sorting: ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        bubbleSort2(arr);
        System.out.println("\nAfter sorting: ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //bubbleSort auto generate by AI
    public static void bubbleSort2(int data[]){
        // Bubble sort algorithm
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    // Swap data[j] and data[j + 1]
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    //bubbleSort method writed by myself
    public static void bubbleSort(int data[]){
        int temp = 0;
        int loop = 0;

        while(data.length - 1 > loop){
            loop =0;
            for(int x=0; x<data.length-1;x++){
                if (data[x] > data[x+1]){
                    temp = data[x+1];
                    data[x+1] = data[x];
                    data[x] = temp;
                }
                else {
                    loop +=1;
                }
            }
        }
    }
}
