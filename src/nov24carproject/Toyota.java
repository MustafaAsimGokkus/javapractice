package nov24carproject;

public class Toyota extends Car {

	String make = "Toyota";
	String model ="Camry";
	int year = 2015;
	int price = 14000;
	//constructor without parameter
	public Toyota() {
	
	}
	//constructor with parameter
	public Toyota(String model, int year, int price) {
		super(model,year,price);
		this.model = model;
		this.year = year;
		this.price = price;
	}
	@Override
	String carMake() {
		return this.make;
	}
	@Override
	String carModel() {
		return this.model;
	}
	@Override
	int carYear() {
		return this.year;
	}
	@Override
	double carPrice() {
		return this.price;
	}
}
