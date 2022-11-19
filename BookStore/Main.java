/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
class Book{
    private String title;
    private String authorName;
    private float price;
    private int quantity;
    
    public Book(String title, String authorName, float price, int quantity) {
        this.title = title;
        this.authorName = authorName;
        this.price = price;
        this.quantity = quantity;
    }
    
    public String toString(){
        return "Name: " + title + ", author: " + authorName + ", price: " + price + ", quantity: " + quantity; 
    }
    
    public String getBookName() {
        return this.title;
    }
    
    public float getBookPrice() {
        return this.price;
    }
    
}

class Customer{
    private String name;
    
    public Customer(String name) {
        this.name = name;
    }
}


class BookStore{
    String bookStoreName;
    Book[] books;
    
    public BookStore(String bookStoreName, Book[] books) {
        this.bookStoreName = bookStoreName;
        this.books = books;
    }
    
    public void printBooks() {
        for(int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }
    
    public float getPriceAmount(String[] bookNames) {
        float price = 0;
        for(int i = 0; i < books.length; i++) {
            for(int j = 0; j < bookNames.length; j++) {
                if(books[i].getBookName().equals(bookNames[j])) {
                    price += books[i].getBookPrice();
                }
            }
        }
        
        return price;
    }
    
}

public class Main
{
	public static void main(String[] args) {
		Book[] books = new Book[] {
		new Book("C", "previn", 20.0f, 10),
		new Book("C++", "previn", 25.0f, 20)
		};
		
		BookStore APJShop = new BookStore("APJShop", books);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		
		Customer customer = new Customer(name);

		System.out.println("Available books are : ");
		APJShop.printBooks();
		
		System.out.println("Enter Book Names: ");
		String bookNames = scanner.nextLine();
		
		String[] userSelectedBooks = bookNames.split(",");
		float totalPrice = APJShop.getPriceAmount(userSelectedBooks);
		
		System.out.println("Total Price: " + totalPrice);
		
		
		
	}
}
