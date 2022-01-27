package dec22;

import java.util.Arrays;
import java.util.HashMap;

public class LetterOccurrence {
	
	/*    Type code to print the number of occurrence of letters
    in a given string     
   
    Java is easy = {a=3 ,e=2, ....y=1}      */
	public static void main(String[] args) {
		
	
	
	
	String str = " Java^ is& an; object! oriented'? programming, language.";
	str = str.replaceAll("\\s","").replaceAll("\\p{Punct}", "");
	//System.out.println(str); 
	String[] arr1 = str.split("");
	System.out.println(Arrays.toString(arr1));
	
	HashMap <String,Integer> result = new HashMap();
	
	//System.out.println(result);
	
	for (String w : arr1) {
		
		Integer value = result.get(w);
		if(result.get(w)== null) {
			result.put(w, 1);
		}
		
		else{
			result.put(w, value+1);
		}
		
		
		
	}
	
	System.out.println(result);
	
	
	}
	
}	
	

