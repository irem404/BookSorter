
public class Book implements Comparable<Book> {

	private String title;
	private String author;
	private int pageNumber;
	private Tur tur;
	
	
	
	
	
	public Book(String title, String author, int pageNumber, Tur tur) {
		super();
		this.title = title;
		this.author = author;
		this.pageNumber = pageNumber;
		
		this.tur = tur;
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
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	
	public Tur getTur() {
		return tur;
	}
	public void setTur(Tur tur) {
		this.tur = tur;
	}
	@Override
	public int compareTo(Book o) {
		if(this.pageNumber!=o.getPageNumber()) {
			Integer pN = this.pageNumber;
			return pN.compareTo(o.getPageNumber());
		}else {
			return this.title.compareTo(o.getTitle());	
		}
		
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", "
				+ "author=" + author + ", pageNumber=" + pageNumber + ", tur=" + tur + "]";
	}
	
	
	
	
}
