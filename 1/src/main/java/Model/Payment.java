package Model;

public class Payment {
	private int price;
	private String type;
	
	
	public Payment(int price, String type){
		this.price = price;
		this.type = "";
	}
	
	public Payment(String type){
		switch(type){
		case "week" : this.price = 40; break;
		case "month": this.price = 90; break;
		case "year" : this.price = 200; break;
		}
	}
	
	public int getPrice(){
		return price;
	}
	
	public String getType(){
		return type;
	}
}
