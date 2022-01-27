package lambda_method_reference_instruction_35;

  import java.util.List;

   public class Utils {
	   
	 public static void printInTheSameLineWithSpace (Object o) {
		 System.out.print(o+" ");
	 }
	 public static boolean checkEven(int x) {
		 return x%2==0;
	 }
	   
	 public static int getSquare(int x ) {
		 return x*x;
	 }
	   
	 public static boolean checkOdd(int x) {
		 return x%2==1;
	 }  
	  
	 public static int getCube(int x ) {
		 return x*x*x;
	 }  
	   
	 public static char getLastChar(String str ) {
		 return str.charAt(str.length()-1);
	 }
	   
	 public static char getFirstChar(String str) {
			return str.charAt(0);
		}
	public static int sumofDigits(int x) {
		int sum=0;
		while(x>0) {
		
		sum+=x%10;
		x/=10;
			
		}
	return sum;	
	}
	 
	 
	 
	 
	 
   }