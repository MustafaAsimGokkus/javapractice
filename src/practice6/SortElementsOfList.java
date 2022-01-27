package practice6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortElementsOfList {

	public static void main(String[] args) {
	
		//Sort all elements of list
		
		
		 List<String> zoo = new ArrayList<String>();
	      zoo.add("Zebra");
	      zoo.add("Lion");
	      zoo.add("Tiger");
	      
	    Collections.sort(zoo);
		System.out.println(zoo);
		
	}

}
