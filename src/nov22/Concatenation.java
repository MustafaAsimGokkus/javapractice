package nov22;
/*
 int numA = 2;
int numB = 3;
String str1 = “Study”
String str2 = “Hard”
Type a program to see the following outputs on the console
by using “concatenation” operation.
A) Study Hard B) 5 Study C) Hard23 D) Hard1
 */
public class Concatenation {

	public static void main(String[] args) {
	//  A) Study Hard
		 int numA = 2;
		 int numB = 3;
		 String str1 = "Study";
		 String str2 = "Hard";
		 System.out.println(str1+" "+str2);
		 
	//	 B) 5 Study	 
		 System.out.println((numA+numB)+" "+ str1);
		 
    //	C) Hard23 	 
		 
		 System.out.println(str2+numA+numB);
		 
	//	 D) Hard1	 
		 System.out.println(str2+(numB-numA));
		 
		 
		 
	}

}
