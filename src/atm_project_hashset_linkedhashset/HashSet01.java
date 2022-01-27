package atm_project_hashset_linkedhashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
 1)Set means collections with unique elements
 2)Hash is a technique to create unique codes for every data
 3)HashSet works fast.Because it does not put the elements in any order.
  i:insertion order ii)natural order(alphabetical or ascending)HashSet 
  puts the elements in Random Order.
 4)hashSet accepts null as element just once.
 5)if u try to store repeated elements into a set, java will accept
 the repeated elements just once.That rule is valid for null as well. 
 */
public class HashSet01 {

	public static void main(String[] args) {
		
  HashSet <String> hs1 = new HashSet<>();
  hs1.add("K");
  hs1.add("K");
  hs1.add(null);
  hs1.add(null);
  System.out.println(hs1);//[K]
  HashSet <String> hs2 = new HashSet<>();
  hs2.add("K");
  hs2.add("K");
  hs2.add(null);
  hs2.add(null);
 /*equals() checks i)data types ii)no of elements iii)values of elements */
  System.out.println(hs1.equals(hs2));//true
  System.out.println(hs1.remove(null));//true
  System.out.println(hs1.remove("X"));//false
  System.out.println(hs1);
  /*Type code to display elements just once
   Ex:[5,3,2,2,5,3]==>[3,5,2]*/
  List <Integer> l1 = new ArrayList<>();
  l1.add(5);
  l1.add(3);
  l1.add(5); 
  l1.add(2);
  l1.add(5);
  l1.add(3);  
   
 HashSet<Integer> hs3 = new HashSet<>();
   
 hs3.addAll(l1);
 System.out.println(hs3);
   
   
   
  
 
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
	}

}
