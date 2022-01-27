package lambda;

public class Utils01 {

	
	public static void printInTheSameLineWithSpace(Object o) {
	System.out.print(o+" ");
	}
	
	public static boolean checkToBeEven(int x) {
		return x%2==0;
	}
	
	public static  boolean checkTobeOdd (int x) {
		return x%2==1;
	}
	
	public static int getSquare(int x) {
		return x*x;
	}
	
	public static int getCube(int x) {
		return x*x*x;
	}
	
	public static double getHalf(int x) {
		return x/2.0;
	}
	public static char getLastChar(String str) {
		return str.charAt(str.length()-1);
	}
	
	public static char getFirstChar(String str) {
		return str.charAt(0);
	}
	
	
}
