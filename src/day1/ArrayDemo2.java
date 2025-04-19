package day1;

public class ArrayDemo2{
	public static void main(String[] args){
		int data[] = new int[]{1,4,5,9,3};

		//static main method can exec static normal method directly.
		onlyPrint(data);
		for(int y:data){
			System.out.print(y + "\t");
		}

		change(data);
		System.out.println("\n---------------------------");
		for(int y:data){
			System.out.print(y + "\t");
		}
	}
    
    // for each can not used for change array's value.
	public static void onlyPrint(int temp[]){
		for(int x:temp){
			x *= 2;
		}
	}

	public static void change(int temp[]){
		for (int x = 0; x < temp.length; x++) {
            temp[x] *= 2;
        }
	}
}