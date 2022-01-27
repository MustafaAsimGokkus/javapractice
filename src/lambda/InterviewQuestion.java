
package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class InterviewQuestion {
                  //word
	/*Type code to find how many times a letter is repeated ion a given String*/
	public static void main(String[] args) {
		
	
	String str = "Developer team two makes java practises every day";
	// {a=4, b=7, .....}
	
	str = str.replaceAll("[^a-zA-Z]",""); // to get only letters
	String[] letters = str.split("");
	System.out.println(Arrays.toString(letters));
	
	
	HashMap <String,Integer> result = new HashMap<>();
	System.out.println(result); //{}
	
	
	for(String key : letters ) {    //[D, e, v, e, l, o, p, e, r, t, e, a, m, t, w, o, m, a] key=>e.g D
		
		
		
		if(result.get(key) == null) {      
			result.put(key,1) ;
		}else {
			
			result.put(key,result.get(key)+1 );
			
		}
		
	}System.out.println(result);
	
	
	
	
	
  }
}