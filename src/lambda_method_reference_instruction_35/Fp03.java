package lambda_method_reference_instruction_35;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Fp03 {

	public static void main(String[] args) {
		
	
		
		List<String> l = new ArrayList<>();
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
        prtInUppCase01(l);
        System.out.println(); 
        printElementsSortedByLength(l);
        System.out.println(); 
        printElementsReversedSortedByLength(l);
        System.out.println(); 
        printDistinctSortedByLastChar(l);
        System.out.println(); 
        sortByLengthThenFirstCharacter(l);
        System.out.println(); 
        //removeElementsByLengthGreaterThanFive(l);
       // System.out.println(); 
        //printRemoveIfStartingWithAEndingWithN01(l);
       // System.out.println();
      //printRemoveIfStartingWithAEndingWithN02(l);
        System.out.println();
       //removeIflengthBetweenEightAndTenOrEndsWithO(l);
      System.out.println(checkIflengthOfAllElementsGreaterThan12(l));
      System.out.println(checkIfTheInitialOfAnyElementIsX(l));
      System.out.println(checkIfAtLeastOneElementEndingWithR(l));
	}

	/*1) Create a method to print all list elements in uppercase*/
		/*1.Way:*/
	
	public static void prtInUppCase01(List<String> list) {
		list.stream().map(String::toUpperCase).forEach(Utils::printInTheSameLineWithSpace);
		
	}
	
	/*2.Way ==> without converting to stream. list is mutable so no need assignment to changevalues*/
    /*public static void prtInUppCase02(List<String> list) {				
	list.replaceAll(String::toUpperCase);			
	System.out.println(list); 
	}*/
	
	
	/*2) Create a method to print the elements after ordering according to their lengths*/
	
	public static void printElementsSortedByLength(List<String> list) {
		list.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::printInTheSameLineWithSpace);
	}
	
	/*3) Create a method to print the elements after ordering according to their lengths (In reverse order)*/
	public static void printElementsReversedSortedByLength(List<String> list) {
	
	list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Utils::printInTheSameLineWithSpace);
	}
	
	/*4) Create a method to sort the distinct elements by using their last characters*/
	
	public static void printDistinctSortedByLastChar(List<String> list) {
		list.stream().distinct().sorted(Comparator.comparing(Utils::getLastChar)).forEach(Utils::printInTheSameLineWithSpace);
	}
	
	
	/*5) Create a method to sort the elements according to their lengths then according to their first character*/
	public static void sortByLengthThenFirstCharacter(List <String> list) {
		list.stream().sorted(Comparator.comparing(String::length).thenComparing(Utils::getFirstChar)).
		forEach(Utils::printInTheSameLineWithSpace);
	}
	
	/*6) Remove the elements if the length of the element is greater than 5
	public static void removeElementsByLengthGreaterThanFive(List <String> list) {
		list.removeIf(t->t.length()>5);
		System.out.println(list);
	}*/
	
	
	/*7) Remove the elements if the element is starting with ‘A’, ‘a’ or ending with ‘N’, ‘n’*/
	
		/*1.Way:
	public static void printRemoveIfStartingWithAEndingWithN01(List<String> list) {	
	
        Predicate <String> checkCondition = t->t.charAt(0)=='A'||t.charAt(0)=='a'||t.charAt(t.length()-1)=='N'||t.charAt(t.length()-1) =='n';
		list.removeIf(t->checkCondition.test(t));
	   System.out.println(list);}*/
	
	/*2.Way:
		public static void printRemoveIfStartingWithAEndingWithN02(List<String> list) {		
	    list.removeIf(t->t.startsWith("A")||t.startsWith("a")||t.endsWith("N")||t.endsWith("n"));		
	    System.out.println(list);	
		}*/
	
	
	//removeIflengthBetweenEightAndTenOrEndsWithCharO
	/*8) Remove the elements if the length is between 8 and 10 or ending with 'o' 
	
	   public static void removeIflengthBetweenEightAndTenOrEndsWithO (List<String> list) {
		Predicate<String> checkCondition = t->(t.length()>7 && t.length()<11) || t.endsWith("o");
		
		list.removeIf(t->checkCondition.test(t));
	
	    System.out.println(list);
	
	}*/
	
	//checkIflengthOfAllElementsGreaterThan12
	/*9) Create a method to check if the lengths of all elements are less than 12 */ 
	public static boolean checkIflengthOfAllElementsGreaterThan12 (List<String> list) {
		return list.stream().allMatch(t->t.length()<12);
	}
	
		
	 
	
	//checkIfTheInitialOfAnyElementIsX
	 //10) Create a method to check if the initial of any element is not ‘X’ 
	
	public static boolean checkIfTheInitialOfAnyElementIsX (List<String> list) {
		return list.stream().noneMatch(t->t.startsWith("X"));
	}
	
	
	
	//checkIfAtLeastOneElementEndingWithR
    /* 11) Create a method to check if at least one of the elements ending with "r" */
	
	public static boolean checkIfAtLeastOneElementEndingWithR (List<String> list) {
		return list.stream().anyMatch(t->t.endsWith("R"));
	}
	
	
	
}

