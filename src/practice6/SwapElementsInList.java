package practice6;

import java.util.ArrayList;
import java.util.Collections;

public class SwapElementsInList {

	public static void main(String[] args) {
		//Please swap the value 50 with value 20
	      ArrayList<Integer> list = new ArrayList<Integer>();
	      list.add(10);
	      list.add(20);
	      list.add(30);
	      list.add(40);
	      list.add(50);
	      
	     Collections.swap(list, 4, 2);
	     System.out.println(list);
	}
}
		
	     
		
		

	

