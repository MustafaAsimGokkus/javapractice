package day33repetition;

import java.util.Arrays;
import java.util.HashMap;

/*How to count the number of occurrences of the words in a sentence
For example: "Java is easy. Type codes to learn Java. To earn money learn Java."
Java = 3 is=1 easy =1 Type=1 ...learn=2 ....*/
public class InterviewQuestion {

	public static void main(String[] args) {
   
		String str = "Java is easy. Type codes to learn Java. To earn money learn Java.";
	
    //1. punctuation and lower case
		System.out.println("Before punctuation opr: "+str);
		str = str.replaceAll("\\p{Punct}", "").toLowerCase();
		System.out.println("After punctuation opr: "+str);
	//2. split() and convert it to array
		String[] wordsArray = str.split(" ");
		System.out.println(Arrays.toString(wordsArray));
	//3. convert this array to hashmap using loop - logic is here
		
	 HashMap <String, Integer> result = new HashMap<>();
	 for (String w:wordsArray) {   // {java=3, is=1, easy=1, .....}
		 
		 if(result.get(w)==null) {
			 result.put(w, 1);
		 }else {
		    result.put(w, result.get(w)+1);
		 }
	 }System.out.println(result);
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
