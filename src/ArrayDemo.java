import java.util.Arrays;
public class ArrayDemo {
  public static void main(String[] args) {
  	String str = "want you to know one thing";
	int countN = 0;
	int countO = 0;
	char[] charArray= str.toCharArray();
  	for (char i:charArray){
		if(i=='n'){
			countN++;
		}
		if(i=='o'){
			countO++;
		}
  	}

	System.out.println("Number of 'n' in the string: " + countN);
	System.out.println("Number of 'o' in the string: " + countO);
  	
  }   
}
