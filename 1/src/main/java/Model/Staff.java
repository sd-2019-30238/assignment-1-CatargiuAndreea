package Model;
import javax.persistence.*;


@Entity
@Table
public class Staff {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "idStaff")
    private int idStaff;
    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;
	
    public Staff(){
    	
    	
    }
    
	public Staff(String name, String password){
		//this.idStaff = idStaff;
		this.name = name;
		this.password = password;
	}
	
	public int getId(){
		return idStaff;
	}
	
	public String getName(){
		return name;
	}
	
	public String getPassword(){
		return password;
	}
	@Override
	public String toString() {
		return "Customer [id=" + idStaff + ", nume=" + name + ", password=" + password +"]";
	}
}
