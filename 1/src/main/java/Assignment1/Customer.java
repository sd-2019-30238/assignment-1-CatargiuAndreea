package Assignment1;

import java.util.ArrayList;
import java.util.List;



public class Customer {
	private String nume;
	private int id;
	private int payment;
	private String password;
	List <Book> books=new ArrayList<Book>();
	
	public Customer(String nume, int id, int payment, String password){
		this.nume = nume;
		this.id = id;
		this.payment = payment;
		this.password = password;
	}
	public String getNume(){
		return nume;
	}
	public int getId(){
		return id;
	}
	
	public int getPayment(){
		return payment;
	}
	
	public String getPassword(){
		return password;
	}
}
