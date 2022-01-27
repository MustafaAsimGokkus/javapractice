package lambda_method_reference_instruction_35;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02 {
 /*
  In functional programming we can use lambda expressions but if using method reference
  is possible using lambda expressions is not recommended.
  Method reference is like : "Class name :: Method name"
                                  String :: length
  */
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
		printElements(l);
		System.out.println();
		printEvens(l);
		System.out.println();
		printSquareOfOddElements (l);
		System.out.println();
		printCubeOfDistinctElements(l);
		System.out.println();
		sumOfSquaresOfDistinctEvenElements01(l);
		System.out.println();
		productOfCubesOfDistinctEvenElements(l);
		System.out.println();
		getMax01(l);
		System.out.println();
		getMax02(l);
		System.out.println();
		getMax03(l);
		System.out.println();
		getMinElem01(l);
		System.out.println();
		getMinEvenGreaterThanSeven01(l);
		System.out.println();
		getMinEvenGreaterThanSeven02(l);
		System.out.println();
		printHalfOfDistinctElementsGreaterThanFiveReverse01(l);
		System.out.println();
		printHalfOfDistinctElementsGreaterThanFiveReverse02(l);
		System.out.println();
		
	}
	/*1)create a method to print the list elements on the console in the same line 
	with a space between 2 consecutive elements(Functional)*/
	public static void printElements(List<Integer> list) {
		list.stream().forEach(Utils::printInTheSameLineWithSpace);
	}
	
	//2)Create a method to print the even list elements on the console in the same line with a space 
    //  between two consecutive elements.(Functional with method reference)
	
	public static void printEvens(List<Integer> list) {
		list.stream().filter(Utils::checkEven).forEach(Utils::printInTheSameLineWithSpace);
	}
	
	//3)Create a method to print the square of odd list elements on the console in the same line with a 
    //  space between two consecutive elements.(Functional)
	
	public static void printSquareOfOddElements (List<Integer> list) {
		list.stream().filter(Utils::checkOdd).map(Utils::getSquare).forEach(Utils::printInTheSameLineWithSpace);
	}
	
	
	//4)Create a method to print the cube of distinct odd list elements on the console in the same line 
    //  with a space between two consecutive elements.
	public static void printCubeOfDistinctElements(List<Integer> list) {
		list.stream().distinct().filter(Utils::checkOdd).map(Utils::getCube).forEach(Utils::printInTheSameLineWithSpace);
	}
	
	
	
	//5)Create a method to calculate the sum of the squares of distinct even elements
   
	 public static void sumOfSquaresOfDistinctEvenElements01(List<Integer> list) {
	Integer sum =list.stream().distinct().filter(Utils::checkEven).map(Utils::getSquare).reduce(0,Math::addExact);
	System.out.println(sum);
	 }
	
	 //6)Create a method to calculate the product of the cubes of distinct even elements
	
	 public static void productOfCubesOfDistinctEvenElements(List<Integer> list) { 
	Integer product = list.stream().distinct().filter(Utils::checkEven).map(Utils::getCube).reduce(1,Math::multiplyExact);
	System.out.println(product);
	 } 
	
	//7)Create a method to find the maximum value from the list elements
	public static void getMax01(List<Integer> list) {
		Integer max = list.stream().distinct().sorted().reduce(Math::max).get();
	    System.out.println(max);
	}
	public static void getMax02(List<Integer> list) {
		Integer max =list.stream().distinct().sorted(Comparator.reverseOrder()).findFirst().get();
		System.out.println(max);
	}
	
	public static void getMax03(List<Integer> list) {
		Integer max =list.stream().reduce(Integer.MIN_VALUE,Math::max );
		System.out.println(max);
		}
	
    //8)Create a method to find the minimum value from the list elements(Method Reference)
	public static void getMinElem01(List<Integer> list) {
	Integer min = 	list.stream().reduce(Integer.MAX_VALUE,Math::min);
	System.out.println(min); 
	}
	
	//9)Create a method to find the minimum value which is greater than 7 and even from the list
	public static void getMinEvenGreaterThanSeven01(List<Integer> list) {
	Integer num = list.stream().distinct().filter(Utils::checkEven).filter(t->t>7).sorted().findFirst().get();
	System.out.println(num);
	}
	public static void getMinEvenGreaterThanSeven02(List<Integer> list) {
	Integer num = list.stream().distinct().filter(Utils::checkEven).filter(t->t>7).reduce(Integer.MAX_VALUE,Math::min);
	System.out.println(num);
	}
	//10)Create a method to find the half of the elements which are 
	//distinct and greater than 5 in reverse order in the list.
	
	public static void printHalfOfDistinctElementsGreaterThanFiveReverse01(List<Integer> list){
		list.stream().distinct().filter(t->t>5).map(t->t/2.0).sorted(Comparator.reverseOrder());
		System.out.println(list);
	}
	
	public static void printHalfOfDistinctElementsGreaterThanFiveReverse02(List<Integer> list){
		list.stream().distinct().filter(t->t>5).map(t->t/2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(list);
	}
	
}
