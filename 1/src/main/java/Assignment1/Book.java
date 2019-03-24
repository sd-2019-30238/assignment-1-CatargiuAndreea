package Assignment1;

public class Book {
	private int id;
	private String genre;
	private int releaseDate;
	private String author;
	private String title;
	private int price;
	
	public Book(int id, String genre, int releaseDate, String author, String title, int price){
		this.id = id;
		this.genre = genre;
		this.releaseDate = releaseDate;
		this.author = author;
		this.title = title;
		this.price = price;
	}
	
	public int getId(){
		return id;
	}
	
	public String getGenre(){
		return genre;
	}
	
	public int getReleaseDate(){
		return releaseDate;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public String getTitle(){
		return title;
	}
	
	public int getPrice(){
		return price;
	}
}