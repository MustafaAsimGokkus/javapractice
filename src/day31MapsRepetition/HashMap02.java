package day31MapsRepetition;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap02 {

	public static void main(String[] args) {
	HashMap<String, Integer> hm1 = new HashMap<>();
	
	hm1.put("Ali", 3);	
	hm1.put("Velihan", 5);		
	hm1.put("Maria", 5);		
	
	//print all entries on the console in different lines	
	 Set <Entry<String,Integer>> setFromMap = hm1.entrySet();	
	
	 for(Entry<String, Integer> w:setFromMap) {
		System.out.println(w);
	}
		
		
		
		

	}

}
