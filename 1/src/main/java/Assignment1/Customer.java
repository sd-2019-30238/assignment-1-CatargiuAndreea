package Assignment1;

import java.util.ArrayList;
import java.util.List;



public class Customer {
	private String nume;
	private int id;
	
	private String payment;
	List <Book> books=new ArrayList<Book>();
	public Customer(String nume, int id, String payment){
		this.nume = nume;
		this.id = id;
		
		this.payment = payment;
	}
	public String getNume(){
		return nume;
	}
	public int getId(){
		return id;
	}
	
	public String getPayment(){
		return payment;
	}
}
