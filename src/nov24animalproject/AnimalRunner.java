package nov24animalproject;

public class AnimalRunner {

	public static void main(String[] args) {
   System.out.println("======animal 1 =====");
    
   Animal animal1 = new Cat ("saruman", 12 , "home" , true);
   System.out.println("Animal name: "+ animal1.animalName());
   System.out.println("Animal age: " +animal1.animalAge());
   
   System.out.println("is animal domestic: "+ animal1.isDomestic());
	}

}
