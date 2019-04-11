package Model;
import javax.persistence.*;

import dataAccess.JDBC;

@Entity
@Table
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "isAvailable")
	private boolean isAvailable;
	@Column(name = "genre")
	private String genre;
	@Column(name = "releaseDate")
	private int releaseDate;
	@Column(name = "author")
	private String author;
	@Column(name = "title")
	private String title;
	@Column(name= "borrowed")
	private int borrowed;


	public Book(){
		
	}
	
	
	public Book(boolean isAvailable, String genre, int releaseDate, String author, String title, int borrowed){
		//this.id = id;
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
	
	public void setBorrowed(int borrowed){
		this.borrowed = borrowed;
	}
	
	public int getBorrowed(){
		return borrowed;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", isAvailable=" + isAvailable + ", genre=" + genre + ", "
				+ "releaseDate=" + releaseDate + ", author =" + author + ", title = " + title +  ", borrowed =" + borrowed +"]";
	}

	
	
}
