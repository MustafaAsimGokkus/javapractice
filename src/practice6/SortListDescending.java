package practice6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortListDescending {

	public static void main(String[] args) {
		  ArrayList<Integer> myList = new ArrayList<Integer>();
	      myList.add(30);
	      myList.add(99);
	      myList.add(12);
	      myList.add(23);
	      myList.add(8);
	      myList.add(94);
	      myList.add(98);
	      myList.add(66);
	      
	      myList.stream().sorted(Comparator.reverseOrder());
	      Collections.sort(myList,Collections.reverseOrder());
	      
	      
	}

}
