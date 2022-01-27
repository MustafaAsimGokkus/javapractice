package atm_project_hashset_linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

/*
  1)if you need to store unique elements in insertion order use LinkedHashSet
 LinkedHashSet:Insertion Order TreeSet:Natural Order
 
 */
public class LinkedHashSet01 {

	public static void main(String[] args) {
   Set <Integer> lhs1=new LinkedHashSet<>();
   lhs1.add(12);
   lhs1.add(23);
   lhs1.add(10);
   lhs1.add(32);
   lhs1.add(5);
   
   System.out.println(lhs1);//[12, 23, 10, 32, 5]
   /*Type code to display elements just once
   Ex:[5,3,2,2,5,3]==>[3,5,2]*/
   
   Set <Integer> lhs2=new LinkedHashSet<>();
   
   lhs2.addAll(lhs1);
   System.out.println(lhs2);//[12, 23, 10, 32, 5]
   
   
   
   
   
   
   
   
   
   
   
   
   
	}

}
