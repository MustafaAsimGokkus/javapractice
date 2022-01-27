package car_practice;







public class Toyota extends Car {

    String make = "Toyota";
	String model= "Camry";
	int year = 2020;
	double price= 5000;
	static {
		System.out.println("Toyota is coming");
	}
	
	public Toyota() {
	
	}
    
	public Toyota(String model, int year,String make) {
		
		super(model,year,make);
		this.model = model;
		this.year = year;
		this.make =make;
	}

	@Override
	String carMake() {
		
		return "The car make is: "+ this.make;
	}

	@Override
	String carModel() {
		
		return "The car model is: "+this.model;
	}

	@Override
	int carYear() {
		System.out.print("Year: ");	
		return this.year;
	
	}

	@Override
	double carPrice() {
		System.out.print("Price: ");	
		return this.price;
	}

}
