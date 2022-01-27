package lambda;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class Lambda01 {
/*
1)lambda is functional programming. westarted to use lambda in java 8
2)In functional programming er focus on what to do but in structured programming we focus on "how to do"
3)functional programming can be used just with arrays and collections
4)by using entrySet() method convert Map to Set then you can use functional programming
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
			
			
	}
	
	
	/*1)Create a method to create the even list elements on the console in the 
	same line with a space between 2 consecutive elements(Structured)*/
    public static void printElementsStructured(List<Integer> list) {
    	for (Integer w: list) {
    		
    			System.out.print(w+ " ");
    		}
    }
    
    /* 1-Functional*/
    public static void printElementsFunctional (List <Integer> list) {
   	 list.stream().forEach(t->System.out.print(t+ " "));
    }
   
    
    
    
	/*2) Create a method to create the even list elements on the console in the 
	same line with a space between 2 consecutive elements(Functional)*/
    public static void printEvenListElementsStructured(List<Integer> list) {
    	for (Integer w: list) {
    		if(w%2==0) {
    			System.out.print(w+ " ");
    		}
    	}
    }
     /*2 Functional*/
    
    public static void printEvenListElementsFunctional(List<Integer> list) {
    	list.stream().filter(t->t%2==0).forEach(t->System.out.print(t+" "));
    }
    
	/* 3) Create a method to print the square of odd list elements on the console
	in the same line with a space between 2 consecutive elements (Functional)
	! this is what I thought first but it does not print even numbers .task tells me to update a list
	but this one prints only square of odds does not print evens*/
     public static void printSquareOfOdd(List<Integer> list) {
    	 list.stream().filter(t->t%2==1).map(t->t*t).forEach(t->System.out.print(t+" "));
     }
	/* ===> when you need to update a list use always map*/
 
	/*4) create a method to print the cube of distinct odd list elements on the console 
	in the same line with a space between 2 consecutive elements (Functional)*/ 
     
     public static void cubeDistinctOdd(List <Integer> list) {
    	 list.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t->System.out.print(t+" "));
     }
     
     
	/*5) Create a method to calculate the sum of the squares of distinct even elements*/
     
     public static void sumOfSquaresOfDistinctEvent(List <Integer> list) {
    	Integer sum = list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u); // 0, (t, u)->t+u
     System.out.println(sum);
     }
     
	/*6) Create a method to calculate the product of the cubes of distinct even elements*/
	 
	 public static void productOfCubeOfEvenElements(List<Integer>list) {
		Integer sum=list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)->t*u); 
		System.out.println(sum);
	 }
	 /*7)Create a method to find the maximum value from the list elements*/
    
	//Q7==>1.way
	 public static void getmaxElement01(List <Integer> list) {
    	 Integer max = list.stream().distinct().reduce(Integer.MIN_VALUE, (t,u)->t>u?t:u);
    	 System.out.println(max);
     }
	//Q7==>2.way
	 public static void getmaxElement02(List <Integer> list) {
		 Integer max = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t,u)->u);
		 System.out.println(max);
	 }
	
    /*8) Homework==>Create a method to find the minimum value from the list elements(In 2 ways)*/
		
    /*9)Create a method to find the minimum value which is greater than 7 and even from the list*/
     /*1st way*/
	 public static void minGreaterThanSeven01(List <Integer> list) {
    	 
    Integer min=list.stream().distinct().filter(t->t%2==0).filter(t->t>7).reduce(Integer.MAX_VALUE, (t,u)->t>u?u:t);
     System.out.println(min);}
     
	 /*2nd way*/
     public static void minGreaterThanSeven02(List <Integer> list) {
    Integer max=list.
    		stream().
    		distinct().filter(t->t%2==0).
    		filter(t->t>7).
    		sorted(Comparator.reverseOrder()).
    		reduce(Integer.MAX_VALUE, (t,u)->u);
     System.out.println(max);
     }
     
     /*3rd way*/
     public static void minGreaterThanSeven03(List <Integer> list) {
    	 
    Integer min = list.stream().distinct().filter(t->t>7).reduce(Integer.MAX_VALUE,(t,u)->u<t?u:t);
    System.out.println(min);
     }
     
   
	/*10)Create a method to find the half of the elements which are 
	distinct and greater than 5 in reverse order in the list.*/
	
	public static void getHalfOfDistinctElements(List<Integer> list) {
	List<Double>list1=	list.
			stream().distinct().
			filter(t->t>5).map(t->t/2.0).
			sorted(Comparator.
			reverseOrder()).
			collect(Collectors.toList());
	System.out.println(list1);
	}
	
	
	
	
	
	
	
	
}
