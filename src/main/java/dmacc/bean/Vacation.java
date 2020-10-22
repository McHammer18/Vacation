package dmacc.bean;


import javax.persistence.*;

@Entity
public class Vacation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String town;
	private String state;
	private double miles;
	
	//constructors
	public Vacation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vacation(int id, String town, String state, double miles) {
		super();
		this.id = id;
		this.town = town;
		this.state = state;
		this.miles = miles;
	}
	
	
	public Vacation(String town, String state, double miles) {
		super();
		this.town = town;
		this.state = state;
		this.miles = miles;
	}
	//getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public double getMiles() {
		return miles;
	}
	public void setMiles(double miles) {
		this.miles = miles;
	}
	@Override
	public String toString() {
		return "Vacation [id = " + id + ", Town = " + town + ", State = " + state + ", Miles = " + miles + "]";
	}
	
	

}
