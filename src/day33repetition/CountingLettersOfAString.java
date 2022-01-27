package day33repetition;

import java.util.HashMap;

public class CountingLettersOfAString {
	
	/*Type code to count the number of occurrences of the letters(alphabetical characters)in 
    a sentence For example : "Java is easy. type codes to learn java. To earn money learn java."
    {a=10, c=1, d=1, e=7, i=1, J=3, l=2, m=1, n=4, o=4, p=1, r=3, s=3, T=2, t=1, v=3, y=3}*/
   
    
	public static void main(String[] args) {
	
		String str = "Java is easy. If you study hard it is easy. if you do not study it is difficult.";
		str = str.replaceAll("^[a-zA-Z]", "");
		str=str.replaceAll(" ", "");
		str=str.replaceAll("\\p{Punct}", ""); // "\\p{Punct}"
		String [] letters = str.split("");		
		
		//now we will convert this string array to a HashMap {a=12, c=6, ..}
		HashMap<String,Integer> result = new HashMap<String,Integer>();
		
		for(String w:letters) {
			
			if(result.get(w)==null) {
				result.put(w, 1);
			}
			else {
			  result.put(w, result.get(w)+1);
			}
		}System.out.println(result);
		
		


	}

}
