package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda03 {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
        l.add("Ali");
        l.add("Ali");
        l.add("Mark");
        l.add("Amanda");
        l.add("Christopher");
        l.add("Jackson");
        l.add("Mariano");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Benjamin");
        
        
        
          newMethod(l);
        
          method5(l);
        
        
        
        
        
        
        
    
	}

	//1) Create a method to print all list elements in uppercase
	//1.Way
		
		/*2. way for uppercase task
		public static void printInUpperCases02(List<String> list) {	
		list.replaceAll(String::toUpperCase);*/
		
	    //2) Create a method to print the elements after ordering according to their lengths
	    
	   
	   
		//public static void 
		
		//3) Create a method to print the elements after ordering according to their lengths (In reverse order)
		
	   
		
		//4) Create a method to sort the distinct elements by using their last characters
	    public static void newMethod(List<String> list) {
	     
	    	list.stream().distinct().sorted(Comparator.comparing(Utils01::getLastChar))
	    	.forEach(Utils01::printInTheSameLineWithSpace);;;;;;;;;;;;;;;;;;;;;;
	   
	    }
		
		//5) Create a method to sort the elements according to their lengths then according to their first character
	    public static void method5(List<String> list) {
	    	
	    	list.stream().sorted(Comparator.comparing(String::length).thenComparing(Utils01::getFirstChar))
	    	.forEach(Utils01::printInTheSameLineWithSpace);;
	    	
	    }
		
		
		//6) Remove the elements if the length of the element is greater than 5
		
		
		
		//7) Remove the elements if the element is starting with ‘A’, ‘a’ or ending with ‘N’, ‘n’

      
}
	
	
	
	
	
	
	
	
	
	

