package co.book;
import java.util.ArrayList;
public class Library {
	private String name;
	ArrayList<Book> L = new ArrayList<Book>();
	
	public Library(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void addBook(Book b) {
		L.add(b);
	}
	public void searchBook(String author){
		int k = 0;
		for (Book z:L) {
			if(z.getAuthor().toLowerCase().equals(author.toLowerCase())) {
				System.out.println("The book is in the Library and the details are: "+ z.toString());
				k = 1;
		}
	}if(k!=1) {
		System.out.println("Book not found");
	}
}
	public void removeBook(String author) {
		int i = 0;
		for (Book z:L) {
			if(z.getAuthor().toLowerCase().equals(author.toLowerCase())) {
				System.out.println("The book has been removed "+ L.remove(z));
				i = 1;
			}
	}if(i!=1) {
		System.out.println("Book not found");
	}
	}
	public void view()
{
    for(Book z:L)
    {
    System.out.println(z.getTitle());
    System.out.println(z.getAuthor());
    System.out.println(z.getPublisher());
    System.out.println(z.getRdate());
    System.out.println(z.getIsbn());
    }
    
}
}