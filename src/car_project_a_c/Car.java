package car_project_a_c;
/* Q1) Can we create instance variables in abstract class==> Yes
   
   Q2) Can we create concrete methods in abstract classes? ==> yes
   
   Q3) Can we create objects from abstract classes ==>No
       Because by objects we can reach methods and abstract 
       methods do not have body, we get error
   Q4) Can we create constructors in abstract classes? ==> Yes
   
   Q5) Constructors are to create object. If we cannot create object from abstract class 
   then what is the usage of constructor in abstract classes?==> 
  
   i)to reach to the instance variables of abstract class from concrete child class
   ii)to assign values to the instance variables using super constructor call with
   parameter when we create an object from concrete child class
   
   *Static class: i) it runs only once when the class is loaded into memory
                 ii)to initialize static variables
   */
   
   
   
public abstract class Car {

	String make;
	String model;
	int year;
	double price;
	
	static {
		System.out.println("Car is on the way");
	}
	
	

	public Car() {
		
	}

    


	public Car(String model, int year, double price) {
		this.model = model;
		this.year = year;
		this.price = price;
	}




	/* abstract methods */
	abstract String carMake();
	abstract String carModel();
	abstract int carYear();
	abstract double  carPrice();
	
	
	
}
