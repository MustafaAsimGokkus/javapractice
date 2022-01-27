package day30repetition;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class LinkedList01 {

	public static void main(String[] args) {
	
	LinkedList <String>ll1 = new LinkedList<>();	
		
	ll1.add("Ali");
	ll1.add("Can");
	ll1.add("Mark");
	ll1.add("Tom");
	
	/* How to print LinkedList*/
	System.out.println(ll1);
	
	/* How to get first element from a LinkedList */
	String firstElement01 = ll1.element(); //element() returns first element
	
	
	
	String firstElementRemoved = ll1.poll(); 
	System.out.println(firstElementRemoved);
	System.out.println(ll1); //Ali
	
	String firstElement02 = ll1.getFirst();
	System.out.println(firstElement02);//Can
	System.out.println(ll1);//getFirst() returns the first element without removing
	
	String firstElement03 = ll1.peek();
	System.out.println(firstElement03);
	System.out.println(ll1);
	
	LinkedList <String>ll2 = new LinkedList<>();
	/*String firstElementFromEmptyLinkedList  = ll2.element();
	System.out.println(ll2);// element() throws NoSuchElementException for the empty LinkedList */
	
	String firstElementFromEmptyLinkedList02  =ll2.peek(); //null==>peek() returns first element without removing 
	System.out.println(firstElementFromEmptyLinkedList02); //and it returns "null" for empty LinkedList
	
	String firstElementFromEmptyLinkedList03= ll2.poll(); 
	System.out.println(firstElementFromEmptyLinkedList03);//null==>poll() returns null for empty LinkedList
	System.out.println(ll2);
	
	/*String firstElementFromEmptyLinkedList04= ll2.getFirst(); 
	System.out.println(firstElementFromEmptyLinkedList04);==>getFirst() throws NoSuchElementException for the empty LinkedList */
	                                                     
	/*How to remove elements from LinkedList */
	LinkedList <Integer> ll3 = new LinkedList<>();
	
	ll3.add(0,12); // when you use add(index,element) make indexes in ascending order
	ll3.add(1,13);
	ll3.add(2,10);
	ll3.add(3,11);
	
	System.out.println(ll3);
	Integer first01= ll3.remove();//Retrieves and removes the head (first element) of this list.
                 //@return the head of this list
    	         //@throws NoSuchElementException if this list is empty
    
	System.out.println(first01);//12
	System.out.println(ll3);//[13, 11, 10]
	
	Integer second = ll3.remove(2);
	System.out.println(second); //11
	System.out.println(ll3);//[13,10]
	
	ll3.add(13);
	ll3.add(10);
	ll3.add(13);//[13,10,13,10,13]
	
	ll3.removeFirstOccurrence(13);
	System.out.println(ll3); //[10, 13, 10, 13]
	
	ll3.removeLastOccurrence(10);
	System.out.println(ll3); //[10, 13, 13]
	
	ll3.add(12);
	ll3.add(9);
	ll3.add(8);
	ll3.add(3);
	System.out.println(ll3); //[10, 13, 13, 12, 9, 8, 3]
	
	LinkedList<Integer>ll4 = new LinkedList <Integer>();
	ll4.add(3);
	ll4.add(12);
	ll4.add(13);
	
	ll3.removeAll(ll4);
	System.out.println(ll3); //[10, 9, 8]
	
	//How to insert elements into a LinkedList
	ll4.addAll(ll4); //[3,12,13,3,12,13] 
	System.out.println(ll4);
	
	ll4.addAll(1, ll3); // Appends the specified element to the end of this list. This method is equivalent to addLast.
	System.out.println(ll4); //[3, (10,9,8) ,12,13,12,13,12] ==> [3, 10, 9, 8, 12, 13, 3, 12, 13] 
 
    ll4.addFirst(100);
	System.out.println(ll4); //[100, 3, 10, 9, 8, 12, 13, 3, 12, 13]
	
	 ll4.addLast(900); // to be more readable choose addLast() instead of add()
	System.out.println(ll4); //[100, 3, 10, 9, 8, 12, 13, 3, 12, 13, 900]
	
	//How to update a specific node
	ll4.set(6, 200);
	System.out.println(ll4); //[100, 3, 10, 9, 8, 12, 200, 3, 12, 13, 900]
	
	ll4.subList(3, 6); //first index is inclusive second index is exclusive
	System.out.println(ll4.subList(3, 6)); // [9,8,12]
	System.out.println(ll4); // [100, 3, 10, 9, 8, 12, 200, 3, 12, 13, 900] no update on original list
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
