package Model;
//import GUI.GUICreateAcc;

public class newAccount {
	private String name;
	private int id;
	private Payment myPayment;
	private String password;
	
	public newAccount(String name, int id, String password, Payment myPayment){
		this.name = name;
		this.id = id;
		this.password = password;
		this.myPayment = myPayment;
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
	
	public void setPayment(Payment myPayment){
		this.myPayment = myPayment;
	}
	
	public Payment getPayment(){
		return myPayment;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getPassword(){
		return password;
	}
}
