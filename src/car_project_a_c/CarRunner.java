package car_project_a_c;

public class CarRunner {

	public static void main(String[] args) {
	System.out.println("======Car1======");	
    Car car1 = new Honda();
    System.out.println(car1.model);//null
    System.out.println(car1.carMake());
    System.out.println(car1.carModel());
    System.out.println(car1.carYear());
    System.out.println(car1.carPrice());
    
    System.out.println("======Car2======");
    Car car2 = new Honda("Civic",2020,30000);
    System.out.println(car2.model);//null
    System.out.println(car2.carMake());
    System.out.println(car2.carModel());//civic
    System.out.println(car2.carYear());//2020
    System.out.println(car2.carPrice());//30000
    
    System.out.println("======Car3======");
    Car car3 = new Toyota();
    System.out.println(car3.model); // null
    System.out.println(car3.carMake());
    System.out.println(car3.carModel());
    System.out.println(car3.carYear());
    System.out.println(car3.carPrice());
    
    System.out.println("======Car4======");
    Car car4 = new Toyota("Corolla",2014,54000);
    System.out.println(car4.model);//corolla
    System.out.println(car4.carMake());//toyota
    System.out.println(car4.carModel());//corolla
    System.out.println(car4.carYear());//2014
    System.out.println(car4.carPrice());//54000
    
	}

}
