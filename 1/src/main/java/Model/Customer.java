package Model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;


@Entity
@Table
public class Customer {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "nume")
    private String nume;
    @Column(name = "password")
    private String password;
    @Column(name = "myPayment")
    private String myPayment;
    //@Column(name = "borrowBooks")
    //List <Book> borrowBooks = new ArrayList<Book>();

	public Customer(){
		
	}
	
	public Customer(String nume, String password, String myPayment){
		//this.id = id;
		this.nume = nume;
		this.password = password;
		this.myPayment = myPayment;
	}
	public String getNume(){
		return nume;
	}
	
	public void setName(String nume){
		this.nume = nume;
	}
	
	public int getId(){
		return id;
	}
	
	public String getPayment(){
		return myPayment;
	}
	
	public void setPayment(String myPayment){
		this.myPayment = myPayment;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", nume=" + nume + ", password=" + password + ", "
				+ "payment=" + myPayment + "]";
	}
}