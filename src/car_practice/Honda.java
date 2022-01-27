package car_practice;



public class Honda extends Car {
	
	
	String make = "Honda";
	String model= "CRV";
	int year = 2020;
	double price= 9000;
	
	static {
		System.out.println("Honda is coming");
	}

	public Honda() {
		
	}
     
		
	public Honda(String model, int year, String make) {
		super(model,year,make);
		this.model = model;
		this.year = year;
		this.make = make;
	}




	@Override
	String carMake() {
		return "The car make is: "+this.make;
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
