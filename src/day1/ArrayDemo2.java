package day1;

class Book {
    private String title ;
    private double price ;
    public Book(String t,double p) {
        title = t ;
        price = p ;
    }
    // setter、getter、无参构造略
    public String getInfo() {
        return "Book's Name: " + title + ", Price: " + price ;
    }
}

//Init array at one time
public class ArrayDemo2 {
    public static void main(String args[]) {
        Book books[] = new Book[]{
                new Book("Java", 79.8),
                new Book("JSP", 69.8),
                new Book("Android", 89.8)};
        for (int x = 0; x < books.length; x++) {
            System.out.println(books[x].getInfo());
        }
    }
}
