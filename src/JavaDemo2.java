class CountClass{
	public static int countClassNum;

    public static int getCountClassNum(){
    	return countClassNum ++ ;
    }

	public static void getInfo(){
      
      System.out.println("我是第" + getCountClassNum() +"个类");
	}
}

public class JavaDemo2{
	public static void main(String[] args) {
		new CountClass().getInfo();
		new CountClass().getInfo();
		new CountClass().getInfo();
		new CountClass().getInfo() ;
	}
}