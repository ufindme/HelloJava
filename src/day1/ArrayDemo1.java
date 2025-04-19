package day1;

public class ArrayDemo1{
	public static void main(String[] args){
		int data[] = null;
		data = new int[]{17,3,12,5,9,21,14,7,32,1,18,10};
		int temp[] = data;
        
        temp[0] = 66;
		temp[2] = 99;
        System.out.println("\n-------First-------");
		for(int x:temp){
			System.out.print(x+"\t");
		}
        
        int data2[][] = new int[][]{
           {1,2,3} ,{4,5,6} , {7,8,9} 
        };
        System.out.println("\n======second=======");
        for (int singleArray[]:data2){
            for (int y:singleArray){
                System.out.print(y + "\t");
            }
            System.out.print("\n");
        }
    }
}