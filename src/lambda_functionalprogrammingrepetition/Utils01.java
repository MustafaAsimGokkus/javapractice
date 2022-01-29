package lambda_functionalprogrammingrepetition;


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
		
		public static int sumOfDigits(int x) {
			
		return x == 0 ? 0 : x%10 + sumOfDigits(x/10);
				
		}
			
		public static int getSumOfDigits(int x) {
			int sum = 0;
			while(x!=0) {
				sum+=x%10;
				x/=10;
				
			}
			return sum;
		}
		
		
	}


