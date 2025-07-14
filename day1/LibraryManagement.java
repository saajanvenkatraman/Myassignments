package week2.day1;

public class LibraryManagement {
public static void main(String[] args) {
	Library book = new Library();
	String book2 = book.addBook("It is a science book");
	System.out.println(book2);
	book.issueBook();
}
}
