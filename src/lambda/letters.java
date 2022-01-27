package lambda;

import java.util.Arrays;
import java.util.HashMap;

public class letters {

	public static void main(String[] args) {
		/*    Type code to print the number of occurrence of letters
	       in a given string     
	      
	       Java is easy ={a=3 ,e=2, ....y=1}      */	
		
		
		String str = "[{{?{{Learn,,%^ java earn money*/Java is object oriented";
		
		// get rid of all except letters
		str =str.replaceAll("\\p{Punct}", "").replaceAll("\\s", "");
		//System.out.println(str);
		
		String [] arr1 = str.split("");
		System.out.println(Arrays.toString(arr1));//[L,e, a, r..]
		
		HashMap <String , Integer> result = new HashMap();
		
		for (String w: arr1) {
			Integer value = result.get(w);   // //{}
			if(value == null) {
				result.put(w, 1);
			}
			else {
				result.put(w, value+1);
			}
			
		}System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
