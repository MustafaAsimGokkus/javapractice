package practice6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayElementsList {

	public static void main(String[] args) {

		
		
		//Add elements of list to an Array and print them on the console	
		
		List<String> list1 = new ArrayList<String>();		    
		
		list1.add("Ahmet");		    
		list1.add("Hasan");		    
		list1.add("Susan");		     
		list1.add("Susan");		     
		list1.add("Peter");
		
		Object[]arr = list1.toArray();
		System.out.println(Arrays.toString(arr));
		
		
		
		
		/*List<String> arr1[] = new [5]ArrayList()<>;		
		arr1[0] = "Ahmet";
		arr1[1] = "Hasan";
		arr1[2] = "Susan";
		arr1[3] = "Susan";
		arr1[4] = "Peter";
		
		
		System.out.println(Arrays.toString(arr1));*/
		
		List<String> list2 = new ArrayList(Arrays.asList(list1));
		System.out.println(list2);
		
		
		
		
		
		
		

	}

	
	
}
