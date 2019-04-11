package bll;
import java.util.ArrayList;
import java.util.List;

import Model.Book;
import Model.Customer;
import dataAccess.CustomerAccess;

public class LibraryManagement {
	private List <Book> available=new ArrayList<Book>();
	private List <Book> notAvailable = new ArrayList<Book>();
	private List <Customer> waitingList = new ArrayList<Customer>();
	private int totalPrice;

	public LibraryManagement(int totalPrice){
		this.totalPrice = totalPrice;
	}

	public void addTotalPrice(int priceBook){
		this.totalPrice += priceBook;
	}
	
	public void addToAvailable(Book book){
		this.available.add(book);
	}
	
	public void removeFromAvailable(Book book){
		this.available.remove(book);
	}
	
	public void addToUnavailable(Book book){
		this.notAvailable.add(book);
	}
	
	public void removeFromUnavailable(Book book){
		this.notAvailable.remove(book);
	}
	
	public void addCustomerToWaitingList(Book book,Customer customer){
		this.waitingList.add(customer);
	}
	
	/*public void assignBook(Book book, Customer customer){
		if(book.isAvailable){
			this.waitingList.remove(customer);
			//book.
			//this.waitingList.get(0).borrowBook(book);
		}
	}*/
	public static void addCustomer(bll.Customer customer){
		CustomerAccess.addCustomer(customer.getNume(), customer.getPassword(), "user");
	}

	
	
	
}