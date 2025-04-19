package day1;

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

	public void arraysOrder(){
		Arrays.sort(arr);
	}
}

class ReverseArray extends Array{
	public ReverseArray(int size){
		super(size);
	}

	public void reverseArrays(){
		int center = arr.length/2;
		for(int i=0; i<center; i++){
			int temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
	}
}
public class ArrayDemo {
  public static void main(String[] args) {
	  ReverseArray arr = new ReverseArray(5);
  	System.out.println(arr.insert(10));
	System.out.println(arr.insert(20));
	System.out.println(arr.insert(31));
	arr.extend(3);
	System.out.println(arr.insert(11));
	System.out.println(arr.insert(9));
	System.out.println(arr.insert(18));
	System.out.println(arr.insert(23));
	arr.display();
	arr.reverseArrays();
	arr.display();
  }   
}
