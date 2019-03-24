package Assignment1;

public class Staff {
	private int idStaff;
	private String name;
	
	public Staff(int idStaff, String name){
		this.idStaff = idStaff;
		this.name = name;
	}
	
	public int getId(){
		return idStaff;
	}
	
	public String getName(){
		return name;
	}
}
