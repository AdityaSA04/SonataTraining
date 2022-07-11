package co.book;

public class Book {
	private String title;
	private String author;
	private String publisher;
	private String rdate;
	private String isbn;
	
	public Book(String title, String author, String publisher, String rdate, String isbn) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.rdate = rdate;
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getRdate() {
		return rdate;
	}

	public void setRdate(String rdate) {
		this.rdate = rdate;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "[Title=" + title + ", Author=" + author + ", Publisher=" + publisher + ", Release date=" + rdate
				+ ", ISBN Number=" + isbn + "]";
	}
	
}
