//diffent announce of package with diffent execute command: java day1.TestDemo1
package day1;
/**
 * Encapsulation example of class Book 
 * */
 class Book2{
    private String title;
    private double price;

    /**
     * output info
     * */
    public void getInfo(){
    	System.out.println("Book's Name:" + this.title +"; Price:" + this.price);
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getTitle(){
        return this.title;
    }

    public double getPrice(){
        return this.price;
    }
 }

public class TestDemo2{
    public static void main(String[] args){
    	Book2 book = new Book2();
        book.setTitle("Java Development");
        book.setPrice(89.90);
        Book2 book2 = book;
        book2.setPrice(69.9);
        book2.setTitle("Jsp Development");
        book.getInfo();
        book2.getInfo();

        /* book and book2 share same memory.*/
    }
}
