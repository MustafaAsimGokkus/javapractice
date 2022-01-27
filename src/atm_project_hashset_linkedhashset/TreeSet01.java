package atm_project_hashset_linkedhashset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet01 {
/*
 If you wanna store unique elements in natural order use TreeSet
 */
	public static void main(String[] args) {
	Set<Integer>ts1 =new TreeSet<>();
	ts1.add(12);
	ts1.add(35);
	ts1.add(10);
	ts1.add(46);
	ts1.add(9);
	System.out.println(ts1);
	
	/*1)Q1:how to store unique elements in natural order
	  A1:I use treeSet
	  Q2:But as you know TreeSet is slow. how can you make your code better?
	  A2:i)I create a HashSet and convert it to TreeSet 
	    ii)*/
	
	//1.way
	double t1 = System.nanoTime();
	TreeSet <String>ts2 = new TreeSet<>();
	
	ts2.add("K");
	ts2.add("Z");
	ts2.add("A");
	ts2.add("C");
	ts2.add("T");
	ts2.add("K");
	ts2.add("Z");
	ts2.add("A");
	ts2.add("C");
	ts2.add("T");
	System.out.println(ts2); //[A, C, K, T, Z]
	double t2 =System.nanoTime();
	
	//2.way recommended way
	
  HashSet <String>hs1 = new HashSet<>();
	
    hs1.add("K");
    hs1.add("Z");
	hs1.add("A");
	hs1.add("C");
	hs1.add("T");
	hs1.add("K");
    hs1.add("Z");
	hs1.add("A");
	hs1.add("C");
	hs1.add("T");
	
	TreeSet <String>ts3 = new TreeSet<>(hs1);
	System.out.println(hs1);//not in order==> [A, C, T, Z, K]
	double t3 = System.nanoTime();
	System.out.println(ts3);//[A, C, K, T, Z]
	
	System.out.println("Time required in direct way: "+ (t2-t1));
	System.out.println("Time required in indirect way: "+ (t3-t2));
	
	
	}

}
