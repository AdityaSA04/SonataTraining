package co.book;

public class Test {

	public static void main(String[] args) {
		Book b1 = new Book("Three men in a boat", "Aditya","A publications","28th JAN 2000","123F");
		Book b2 = new Book("Gullivers Travels", "Stephen King", "B publications","30TH JAN 2002","323F");
		Book b3 = new Book("Stranger Things", "Sri", "C publications", "2nd October 2003","333F");
		Library library= new Library("Book");
		library.addBook(b1);
		library.addBook(b2);
		library.addBook(b3);
		library.view();
		library.searchBook("Stephen King");
		library.removeBook("Stephen King");
		library.view();
	}

}
