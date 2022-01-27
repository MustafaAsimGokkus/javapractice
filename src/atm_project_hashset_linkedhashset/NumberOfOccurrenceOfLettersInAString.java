package atm_project_hashset_linkedhashset;

import java.util.HashMap;

public class NumberOfOccurrenceOfLettersInAString {
  /*Type code to print the number of occurrence of letters
    in a given string     
   
    For example for the given:
    String : If Java is easy what is difficult?
    
    
    You should have an output like:
    Java is easy ={a=3 ,e=2, ....y=1}      */
	public static void main(String[] args) {
		
	String str = "If Java is easy what is difficult?";	
	System.out.println(str);
	str= str.replaceAll("[^a-zA-Z]", "");	
	System.out.println(str);	
	String [] arr1 = str.split("");
  //System.out.println(Arrays.toString(arr1));
		
	HashMap <String , Integer>	result = new HashMap();
	
	for (String w : arr1) {
		Integer value = result.get(w);

		if(value == null) {
			
			result.put(w, 1);
		}else {
			
			result.put(w, value+1);
			
		}

	  }	
	System.out.println(result);
	}

}
