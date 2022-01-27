package car_practice;



public class CarsRunner {

	public static void main(String[] args) {
		System.out.println("========car1=========");
		
		  Car car1 = new Toyota();
		 
		  System.out.println(car1.make);//null
		  System.out.println(car1.carMake());//The car make is: Toyota
		  System.out.println(car1.carModel());
		  System.out.println(car1.carYear());
		  System.out.println(car1.carPrice());
		  
		  System.out.println("========car2========="); 
		  
		  Car car2 = new Toyota("Auris", 2020,"Toyota");
		  System.out.println(car2.model);//Auris
		  //System.out.println(car2.carMake());//
		  System.out.println(car2.carModel());//
		  System.out.println(car2.carYear());//
		 // System.out.println(car2.carPrice());//
		  
		  
		  System.out.println("========car3=========");
		  Car car3 = new Honda();
		  System.out.println(car3.make);//null
		  System.out.println(car3.carMake());//the car make is honda
		  System.out.println(car3.carModel());//the car model is crv
		  System.out.println(car3.carYear());// price: 2020
		  System.out.println(car3.carPrice());//
		  
		  System.out.println("========car4=========");
		  Car car4 = new Honda("Jazz",2010,"xyz");
		  System.out.println(car4.make);//Null
		  System.out.println(car4.carModel());//jazz
		  System.out.println(car4.carYear());// 2010
		  
		  
		  
		  
		  
		  
	}

}
