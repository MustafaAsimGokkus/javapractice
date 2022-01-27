package car_project_a_c;

public class Honda extends Car{

	
	 final String make = "HONDA";
	 String model = "Accord";
	 int year = 2012;
	 double price= 8000;
	 
	 static {
			System.out.println("Honda is on the way");
		}
	public Honda() {
		
	}
	
	
	public Honda(String model, int year, double price) {
		super(model,year,price);
		this.model = model;
		this.year = year;
		this.price = price;
	}


	@Override
	String carMake() {
		return "Car maker: "+this.make;
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
