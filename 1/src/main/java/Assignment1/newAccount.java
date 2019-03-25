package Assignment1;

public class newAccount {
	private String name;
	private int id;
	private int payment;
	private String password;
	
	public newAccount(String name, int id, int payment, String password){
		this.name = name;
		this.id = id;
		this.payment = payment;
		this.password = password;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	
	public void setPayment(int payment){
		this.payment = payment;
	}
	
	public int getPayment(){
		return payment;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getPassword(){
		return password;
	}
}
