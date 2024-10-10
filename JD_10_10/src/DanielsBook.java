
public class DanielsBook {
	String bookTitle;
	String bookAuthor;
	String bookPrice;
	String bookQuantity;
	
	public DanielsBook(String title, String author, String price, String quantity) {
		bookTitle = title;
		bookAuthor = author;
		bookPrice = price;
		bookQuantity = quantity;
	}
	
	public String toString() {
		return ("Title: " + bookTitle + "\nAuthor: " + bookAuthor +"\nPrice: " + bookPrice + "\nQuantity: " + bookQuantity);
	}
}
