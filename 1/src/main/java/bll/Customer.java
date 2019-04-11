package bll;

public class Customer {

	private String nume;
	private String password;
	
	
	public Customer(){
		
	}
	
	public Customer(String nume, String password){
		//this.id = id;
		this.nume = nume;
		this.password = password;
	}
	public String getNume(){
		return nume;
	}
	
	public void setNume(String nume){
		this.nume = nume;
	}
	

	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public void createCustomer(){
		LibraryManagement.addCustomer(this);
	}
}
