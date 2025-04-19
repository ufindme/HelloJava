package day1;

//compile command:cd day1; javac TestDemo3.java
//Example of defining a constructor in Java; and overload construction method.
class Book3{
	private String title;
	private double price;
    
    public Book3() {
        System.out.println("constructor with no parameter.") ;
    }
    
	public Book3(String t,double p) {
        setTitle(t) ;
        setPrice(p) ;
        System.out.println("constructor with two parameters.") ;
    }
    public void setTitle(String t) {
        title = t;
    }
    public void setPrice(double p) {
        price = p ;
    }
    public String getTitle() {
        return title;
    }
    public double getPrice() {
        return price;
    }
    public void getInfo() {
        System.out.println("Book's name:" + title + ", Price:" + price);
    }
}

public class TestDemo3{
	public static void main(String[] args){
		Book3 book = new Book3();
        book.setPrice(69.9);
        book.setTitle("Jsp Development");
		book.getInfo();


        //Anonymous objects 
        //One-Time Use: Anonymous objects are often used when you need to call a method or perform an operation just once.
        new Book3("Java Development", 89.9);
	}
}