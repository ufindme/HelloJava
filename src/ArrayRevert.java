public class ArrayRevert {
    public static void printArray(int[] arrys){
        for (int temp:arrys){
           System.out.print(temp + " ");
        }
        
    }
    public static void main(String[] args) {
        int[] arr = new int[]{20,92, 6, 34, 11, 78,5, 12, 9,60, 10, 8,15,  43,30, 15, 2};
        int n = arr.length;
        int temp = 0;
        
        for(int i=0;i<n/2; i++){
          temp = arr[i];
          arr[i] = arr[n-i-1];
          arr[n-i-1] = temp;          
        }

        System.out.println("Reversed Array:");
        printArray(arr);
    }
}
