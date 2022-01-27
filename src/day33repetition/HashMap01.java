package day33repetition;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap01 {
 /*How to count the number of occurrences of the words in a sentence
 For example: "Java is easy. Type codes to learn Java. To earn money learn Java."
 Java = 3 is=1 easy =1 Type=1 ...learn=2 ....*/
 
	public static void main(String[] args) {
		
	String str = "Java is easy. Type codes to learn Java. To earn money learn Java.";	
		
	/*-According to Java "Java and "java." are different but we want 
	them to be same. thats why we removed punctuation marks.
	-to and To are different for Java but in my task they should be same*/
		
	str = str.replaceAll("\\p{Punct}", "");
	String [] words = str.split(" ");
    System.out.println(Arrays.toString(words));
    // At the end {java=3, is=1, easy=1, ......}
    HashMap<String,Integer> result = new HashMap<>();//[Java, is, easy, Type, codes, to, learn, Java, To, earn, money, learn, Java]
    for (String w: words) {
    	Integer numOfOccurrence = result.get(w);
    	//get() method is to get value. in our HashMap values are the num of occurrences
     if (numOfOccurrence == null) {
    	 result.put(w, 1); 
     }else {
    	 result.put(w, numOfOccurrence+1);
     }
    
    
    }
    
    System.out.println(result);
    
    
    
    
    
    
    
    
    
    
    
    
	}

}
