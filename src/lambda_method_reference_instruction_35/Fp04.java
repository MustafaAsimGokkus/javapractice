package lambda_method_reference_instruction_35;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Fp04 {
/* What is IntStream: A sequence of primitive int-valued elements supporting sequential  
  and parallel aggregate operations. This is the int primitive specialization of Stream. */
 
	public static void main(String[] args) {
		
		List <Integer> l = new ArrayList <>();
		l.add(8);
		l.add(9);
		l.add(131);	
		l.add(10);	
		l.add(9);	
		l.add(10);	
		l.add(2);
		l.add(8);
		l.add(15);
		sumOfIntegers7to100_01(7,100);
		System.out.println(sumOfIntegers7to100_02());
		multiplicationBetweenGivenNumbers(2,11);
		System.out.println(calculateFactorial(5));
		System.out.println();
		System.out.println(sumOfIntegersInGivenrange(11,3)); //4+6+8+10 =28
		System.out.println();
		System.out.println(sumOfDigitsInAGivenRange(23,32));
		
		
		
	}

	//1)Create a method to find the sum of integers from 7 to 100
	//1.way sumOfIntegers7to100_01
    public static void sumOfIntegers7to100_01(int x, int y) {
    	System.out.println(IntStream.rangeClosed(x, y).sum());
    }
	
	
	//2.way sumOfIntegers7to100_02
    public static int sumOfIntegers7to100_02() {
    return IntStream.range(7, 101).reduce(0, Math::addExact);	
    }
	
	/*2)Create a method to find the multiplication of the integers from 2(inc) to 11(inc)*/
	public static void multiplicationBetweenGivenNumbers (int x, int y) {
		Integer result;
		
		if (x>y) {
			x=x+y;
			y=x-y;
			x=x-y;
	result = IntStream.rangeClosed(x, y).reduce(1, Math::multiplyExact);
		}else {
			
		result = IntStream.rangeClosed(x, y).reduce(1, Math::multiplyExact);
		
		}
		System.out.println(result);
		
	}
   
   
   
	//If you can do this in interview with functional programming it will be an advantage for you
	/*3)Create a method to calculate the factorial of a given number.(5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5 */
	public static int calculateFactorial(int x) {
	return IntStream.range(1, x+1).reduce(1, Math::multiplyExact);	
	}
  
   
	
	/*4)Create a method to calculate the sum of even integers between given two integers */
	public static int sumOfIntegersInGivenrange(int s, int e) {
		if (s>e) {
		e =e+s;
		s=e-s;	
		e = e-s;
		}

		return IntStream.rangeClosed(s, e).filter(t->t%2==0).reduce(0,Math::addExact);	
	}

		
	
	//5)Create a method to calculate the sum of digits of every integers between given two integers	
	
	public static int sumOfDigitsInAGivenRange(int s, int e) {
		
	return IntStream.rangeClosed(s, e).map(Utils::sumofDigits).sum();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
