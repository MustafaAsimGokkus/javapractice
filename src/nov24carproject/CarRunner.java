package nov24carproject;

public class CarRunner {

	public static void main(String[] args) {
//data type(reference type)          		
		System.out.println("=====Car1====");
		Car car1 = new Honda();
        System.out.println(car1.model);
        System.out.println(car1.carMake()); // car make : honda
        System.out.println(car1.carModel());// 
        System.out.println(car1.carYear());
        System.out.println(car1.carPrice());
        
        System.out.println("=====Car2====");
        
        Car car2 = new Honda("HRV",2020,20000);
        System.out.println(car2.model);// null
        System.out.println(car2.carMake()); // Honda
        System.out.println(car2.carModel()); // civic
        System.out.println(car2.carYear()); // 2020
        System.out.println(car2.carPrice()); // 20000
       
        System.out.println("=====Car3====");
        
        Car car3 = new Toyota ();
        System.out.println(car3.carMake()); 
        System.out.println(car3.carModel()); 
        System.out.println(car3.carYear()); 
        System.out.println(car3.carPrice()); 
        
        
        
        
        
        
        
	}

}
