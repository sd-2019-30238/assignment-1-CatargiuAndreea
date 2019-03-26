package Model;

import java.util.ArrayList;
import java.util.List;



public class Customer {
	private String nume;
	private int id;
	private Payment myPayment;
	private String password;
	List <Book> books=new ArrayList<Book>();
	
	public Customer(String nume, int id, String password){
		this.nume = nume;
		this.id = id;
		this.password = password;
	}
	public String getNume(){
		return nume;
	}
	public int getId(){
		return id;
	}
	
	public Payment getPayment(){
		return myPayment;
	}
	
	public String getPassword(){
		return password;
	}
}
