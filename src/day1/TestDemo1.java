//diffent announce of package with diffent compiling command: javac day1/TestDemo1.java
package day1;
/**
 * Book class
 * */
 class Book1{
    String title;
    double price;

    /**
     * output info
     * */
    public void getInfo(){
    	System.out.println("Book's Name:" + title +"; Price:" + price);
    }
 }

public class TestDemo1{
    public static void main(String[] args){
    	Book1 book = new Book1();
        book.title = "Java Development";
        book.price = 89.90;
        Book1 book2 = book;
        book2.price = 69.9;
        book2.title = "Jsp Development";
        book.getInfo();
        book2.getInfo();

        /* book and book2 share same memory.*/
    }
}
