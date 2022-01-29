package lambda_functionalprogrammingrepetition;

import java.util.stream.IntStream;

public class Lambda01 {

	public static void main(String[] args) {
		
		//System.out.println(sumOfEvenIntegersInGivenRange(23,26));
		System.out.println(sumOfDigitsOfEveryIntegerBetweenTwoIntegers(23,24));
		
	}		
		//4)Create a method to calculate the sum of even integers between given two integers	
		public static int sumOfEvenIntegersInGivenRange(int s, int e) {
			if(s>e) {
				s=s+e;
				e=s-e;
				s=s-e;		
				
			}
			
			
                 return IntStream.rangeClosed(s,e).filter(Utils01::checkToBeEven).sum();
		}

		//5)Create a method to calculate the sum of digits of every integers between given two integers	
	public static int sumOfDigitsOfEveryIntegerBetweenTwoIntegers(int s, int e) {
		return IntStream.rangeClosed(s, e).map(Utils01::getSumOfDigits).sum();
	}
  
	
}
