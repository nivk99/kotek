package week8;

public class Car2 {
	// attributes
	private String Manufacturer;
	private String model;
	private int year;
	private String Color;
	private double fuel;

	// methods
	// constructor method
	public Car2(String man, String mod, int year, String Color, double fuel) {
		this.Manufacturer = man;
		this.model = mod;
		this.year = year;
		this.Color = Color;
		this.fuel = fuel;
	}

	public Car2() {
		this.Manufacturer = "Mazda";
		this.model = "M3";
		this.year = 1998;
		this.Color = "black";
		this.fuel = 1;
	}

	public Car2(String man, String mod, int year, String Color) {
		Manufacturer = man;
		model = mod;
		this.year = year;
		this.Color = Color;
		this.fuel = 1;
	}
	public String toString() {
		return "Manufacturer: "+this.Manufacturer +"/n" +", Model: "+this.model+", Year: "+this.year+", Color: "+this.Color+", Fuel: "+this.fuel;
	} 
	public void Move() {
		this.fuel-=0.1;
		System.out.println("The car "+this.model+" has been moved!");
		System.out.println("The new fuel amount is: "+fuel);
	}
}
