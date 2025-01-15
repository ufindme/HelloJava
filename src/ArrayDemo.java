import java.util.Arrays;
class Array{
	int[] arr;
	int index = 0;
	public Array(int size){
		arr = new int[size];
	}

    //insert method to add element to the array
	public boolean insert(int value){
		if(index < arr.length){
			arr[index] = value;
			index++;
			return true;
		}else {
			return false;
		}
	}

	public void extend(int size){
		int[] newArr = new int[arr.length + size];
		for(int i=0; i<arr.length; i++){
			newArr[i] = arr[i];
		}
		this.arr = newArr;
	}

	//display method to print the array
	public void display(){
		System.out.println(Arrays.toString(arr));
	}
}

class ArrayOrder extends Array{
    public ArrayOrder(int size){
		super(size);
	}

	public void arrayOrder(){
		Arrays.sort(arr);
	}
}

public class ArrayDemo {
  public static void main(String[] args) {
    ArrayOrder arr = new ArrayOrder(5);
  	System.out.println(arr.insert(10));
	System.out.println(arr.insert(20));
	System.out.println(arr.insert(31));
	arr.extend(3);
	System.out.println(arr.insert(11));
	System.out.println(arr.insert(9));
	System.out.println(arr.insert(18));
	System.out.println(arr.insert(23));
	arr.arrayOrder();
	arr.display();
  }   
}
