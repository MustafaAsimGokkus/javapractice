package jan28;

import java.util.stream.IntStream;


public class Lambda02 {
public static void main(String[] args) {
	
	System.out.println(getSumSevenToHundrend01());
	System.out.println(getSumSevenToHundrend02());
	System.out.println(getMul2ToEleven01());

	
}
//1)Create a method to find the sum of integers from 7 to 100
	//1.way
	public static int getSumSevenToHundrend01() {
		return IntStream.range(7, 101).reduce(0,Math::addExact);//same with for loop in structured programing
	}
	
	//2.way
	public static int getSumSevenToHundrend02() {
		return IntStream.rangeClosed(7, 100).reduce(0,Math::addExact);//same with for loop in structured programing
	}	
	
	//2)Create a method to find the multiplication of the integers from 2(inc) to 11(inc)
	public static int getMul2ToEleven01() {
		return IntStream.rangeClosed(2, 11).reduce(1,Math::multiplyExact);//same with for loop in structured programing
	}
		
//3)Create a method to calculate the factorial of a given number.(5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5	
	
	//not good code
//	public static int getFactorial01(int x) {
//      if(x>0) {
//    	  return IntStream.rangeClosed(1, x).reduce(1,Math::multiplyExact);	
//		}
//		System.out.println("No negative number");
//		
//		return 0;
//	}
	
	
	//2nd way ==> recommended code
	
//	public static Object getFactorial02(int x) {
//	      
//	 return x>0 ? IntStream.rangeClosed(1, x).reduce(1,Math::multiplyExact):"No negative number";	
//			
//		}
	
	//4)Create a method to calculate the sum of even integers between given two integers	
	

	//5)Create a method to calculate the sum of digits of every integers between given two integers	
		
	
}
