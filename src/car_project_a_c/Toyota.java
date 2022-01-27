package car_project_a_c;

public class Toyota extends Car {
	
	
	
	
	private final String make = "TOYOTA";
	private String model= "Camry";
	private int year = 2015;
	private double price= 14000;
	
	static {
		System.out.println("Toyota is on the way");
	}
	public Toyota() {
	
	}

	public Toyota(String model, int year, double price) {
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
