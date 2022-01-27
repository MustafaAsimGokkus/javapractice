package atm_project_hashset_linkedhashset;

import java.util.Arrays;
import java.util.HashMap;

public class CountingLettersOfAGivewnString {

	public static void main(String[] args) {
	String str = "Dev team two makes java classes every weekday .";
	str = str.replaceAll("[^a-zA-Z]", "");
  System.out.println(str);
    String[] lettersToBePrinted = str.split("");
  System.out.println(Arrays.toString(lettersToBePrinted) );
    HashMap<String,Integer> result = new HashMap<>();  
   
    for(String key:lettersToBePrinted ) {
    
     Integer value = result.get(key);
      if (value == null) {
    	  
    	  result.put(key,1);
 
      }else {
    	  result.put(key, result.get(key)+1);
      }
     
     
    } System.out.println(result);
    
	}

}
