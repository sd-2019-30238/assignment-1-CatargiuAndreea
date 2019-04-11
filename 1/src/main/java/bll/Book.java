package bll;

public class Book {

	private int id;
	public boolean isAvailable;
	private String genre;
	private int releaseDate;
	private String author;
	private String title;
	private int borrowed;

	public Book(){
		
	}
	
	
	public Book(int id, boolean isAvailable, String genre, int releaseDate, String author, String title, int borrowed){
		this.id = id;
		this.isAvailable = isAvailable;
		this.genre = genre;
		this.releaseDate = releaseDate;
		this.author = author;
		this.title = title;
		this.borrowed = borrowed;

	}
	
	public int getId(){
		return id;
	}
	
	public boolean getAvailable(){
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable){
		this.isAvailable = isAvailable;
	}
	
	public String getGenre(){
		return genre;
	}
	
	public void setGenre(String genre){
		this.genre = genre;
	}
	
	public int getReleaseDate(){
		return releaseDate;
	}
	
	public void setReleaseDate(int releaseDate){
		this.releaseDate = releaseDate;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public void setAuthor(String author){
		this.author = author;
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public int getBorrowed(){
		return borrowed;
	}
	
	public void setBorrowed(int borrowed){
		this.borrowed = borrowed;
	}
}