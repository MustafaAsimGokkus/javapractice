package day33repetition;

import java.util.Arrays;
import java.util.HashMap;

public class InterviewHashMap02 {
    /*
     Type code to count the number of occurrences of the letters(alphabetical characters)in a sentence
     For example : "Java is easy. type codes to learn java. To earn money learn java."
     {a=10, c=1, d=1, e=7, i=1, J=3, l=2, m=1, n=4, o=4, p=1, r=3, s=3, T=2, t=1, v=3, y=3}
    
     */
	public static void main(String[] args) {
		
		String str = "Java is easy. type codes to learn java. To earn money learn java.";
		
		str=str.replaceAll("\\p{Punct}", "");
		str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
		str=str.replaceAll(" ", "");
		String arrayWords []= str.split("");
		System.out.println(Arrays.toString(arrayWords));
		
		HashMap <String,Integer> toBePrinted = new HashMap<>();
		
		for(String w: arrayWords) {
			
			if(toBePrinted.get(w)==null) {
				toBePrinted.put(w, 1);
			}else {
				toBePrinted.put(w, toBePrinted.get(w)+1);	
			}
			
		}System.out.println(toBePrinted);
		
		
		
		
	}

}
