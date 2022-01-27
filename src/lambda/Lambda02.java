package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class Lambda02 {
/*
 in functional programming we can use lambda expressions but if using method
 reference is possible using labda expressions is not allowed
 method reference ==> Class name :: method name
                          String :: length
 */
	public static void main(String[] args) {
	
		/*List<String> l = new ArrayList<>();
        l.add("Ali");
        l.add("Ali");
        l.add("Mark");
        l.add("Amanda");
        l.add("Christopher");
        l.add("Jackson");
        l.add("Mariano");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Benjamin");
        printElements(l);*/
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
		
		
		System.out.println(productCubeDistinctEvenElements (l));;
		
		
		
		
	}
	/*1)create a method to print the list elements on the console in the same line 
	with a space between 2 consecutive elements(Functional)*/
	
	public static void printElements(List<Integer> list) {
		list.stream().forEach(Utils01::printInTheSameLineWithSpace);
		
	}
	
	/*2) Create a method to create the even list elements on the console in the 
	same line with a space between 2 consecutive elements(Functional)*/
	
	
		
	/* 3) Create a method to print the square of odd list elements on the console
	in the same line with a space between 2 consecutive elements (Functional)*/
	
   public static void printSquare (List<Integer> list) {
		
	   list.stream().filter(Utils01::checkTobeOdd).map(Utils01::getSquare).forEach(Utils01::printInTheSameLineWithSpace);
	   
	}
	
	
	/*4) create a method to print the cube of distinct odd list elements on the console 
	in the same line with a space between 2 consecutive elements (Functional)*/ 
	
  
	
	
	
	/*5) Create a method to calculate the sum of the squares of distinct even elements*/
	
	
   public static int sumOfSquares (List<Integer> list) {
	   
	   int result = list.stream().distinct().filter(Utils01::checkToBeEven).map(Utils01::getSquare).reduce(0,Math::addExact);
	    return result;
   }
   
	
	
	/*6) Create a method to calculate the product of the cubes of distinct even elements*/
   public static int productCubeDistinctEvenElements (List<Integer> list) {
	   
	   int result =list.stream().distinct().filter(Utils01::checkToBeEven).map(Utils01::getCube).reduce(1,Math::multiplyExact);
     return result;
   }
	
	
	
	/*7)Create a method to find the maximum value from the list elements*/
	
	
	
	
	/*8) Homework==>Create a method to find the minimum value from the list elements(In 2 ways)*/
	
	
	
	
	/*9)Create a method to find the minimum value which is greater than 7 and even from the list*/
	
	
	
	
	/*10)Create a method to find the half of the elements which are 
	distinct and greater than 5 in reverse order in the list.*/
	
		
      
	
	

	

	
}	
	

