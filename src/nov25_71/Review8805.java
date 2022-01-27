package nov25_71;
/*
 Ask user to enter a word which has 4 letters and output will be inverse 
 of the word.For example; if user enters “MARK” output will be “KRAM”
 */
public class Review8805 {

	public static void main(String[] args) {
		String original = "Yasemin arbeitet zu viel";
		StringBuffer sb = new StringBuffer (original );
		String reversed = sb.reverse().toString();
		
		
		System.out.println(reversed);
		
	/*
	 Ask user to enter a String and output will be the number of the characters in the String.	
	 */
		String str = " Learn Java it is easy";
		System.out.println(str.length());
		
	}

}
