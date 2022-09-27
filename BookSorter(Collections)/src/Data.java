import java.util.TreeSet;

public class Data {

	
	public final static TreeSet<Book> BOOKS = new TreeSet<>();
	
	static {
		
		Book b1=new Book("Harry Potter", "J.K Rowling", 1000,Tur.FANTASTIC);
		Book b2=new Book("Labirent", "Dashner", 456,Tur.BILIMKURGU);
		Book b3=new Book("Aþk", "Elif Þafak", 12333,Tur.ASK);
		Book b4=new Book("Korku", "Stephan", 321,Tur.KORKU);
		Book b5=new Book("Sefiller", "Victor Hugo", 678,Tur.DRAM);
		Book b6=new Book("Beyaz Diþ", "Jack London", 678,Tur.MACERA);
		Book b7=new Book("Simyacý", "Poulo", 213,Tur.FANTASTIC);
		
		BOOKS.add(b1);
		BOOKS.add(b2);
		BOOKS.add(b3);
		BOOKS.add(b4);
		BOOKS.add(b5);
		BOOKS.add(b6);
		BOOKS.add(b7);
		
		
	}
	
}
