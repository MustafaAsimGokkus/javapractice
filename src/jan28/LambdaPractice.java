package jan28;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaPractice {

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

           System.out.println(l);
    //     removeStartsAnEndsNn(l);
    //     checkIfLengthBetween7To11OrEndsWitho(l); //true 
    //     chckToBeLessThanTwelve(l);
        
    //       System.out.println(chkIfInitialOfAnyIsNotX(l));  //false  
        
	}
	
	
	
	
	//7) Remove the elements if the element is starting with ‘A’, ‘a’ or ending with ‘N’, ‘n’
	
	//1.way
//	public static void removeStartsAnEndsNn(List<String> list) {
//	Predicate <String > checkCond = t->t.charAt(0)=='A' ||
//			                           t.charAt(0)=='a' ||
//			                           t.charAt(t.length()-1)=='N' || 
//			                           t.charAt(t.length()-1)=='n'	;
//	
//			list.removeIf(t->checkCond.test(t));
//		
//			System.out.println(list);
//	}
	//2.way
	
	
	// 8) Remove the elements if the length is between 8 and 10 or ending with 'o'
	
	
//	public static void checkIfLengthBetween7To11OrEndsWitho(List<String> list){
//	Predicate <String> chckCond = t-> t.length() >7 && t.length()<11||t.endsWith("o");
//	list.removeIf(t->chckCond.test(t));
//	//[Ali, Ali, Mark, Amanda, Christopher, Jackson, , Tucker,]
//	
//	System.out.println(list);
//	}
	
	//9) Create a method to check if the lengths of all elements are less than 12
	
	
//	public static boolean chckToBeLessThanTwelve(List<String> list) {
//		
//		Predicate<String> checkCondition = t->t.length()<12;
//		
//		boolean result = list.stream().allMatch(t->checkCondition.test(t));
//		System.out.println(result);
//		return result;
//	}
	//10) Create a method to check if the initial of any element is not ‘X’
//	public static boolean chkIfInitialOfAnyIsNotX(List<String> list) {
//		Predicate <String> chckCond = t->t.charAt(0)!='X';
//		boolean result = list.stream().noneMatch(t->chckCond.test(t));
//		return result;
//		
//	}
	
		
	//11) Create a method to check if at least one of the elements ending with “r”
//	public static boolean chckAnyEndsWithr(List<String> list) {
//		Predicate <String> chckCond = t->t.endsWith("r");
//		boolean result = list.stream().anyMatch(t->chckCond.test(t));
//		return result;
//	}
	
	
}
