package car_practice;

public abstract class Car {

	String make;
	String model;
	int year;
	double price;
	
	static {
		System.out.println("The car is coming");
	}
	public Car() {
		
	
		
	}
	public Car(String model, int year,String make) {
		super();
		this.model = model;
		this.year = year;
		this.make = make;
	}
	/* abstract methods */
	abstract String carMake();
	abstract String carModel();
	abstract int carYear();
	abstract double  carPrice();
	
}
