package Assignment1;

public class Borrow {
	private int id;
	private int idBook;
	private int idCustomer;
	
	public Borrow(int id, int idBook, int idCustomer){
		this.id = id;
		this.idBook = idBook;
		this.idCustomer = idCustomer;
	}
	
	public int getId(){
		return id;
	}
	
	public int getIdBook(){
		return idBook;
	}
	
	public int getIdCustomer(){
		return idCustomer;
	}
}