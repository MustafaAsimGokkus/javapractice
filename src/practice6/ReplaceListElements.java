package practice6;

import java.util.ArrayList;
import java.util.Collections;

public class ReplaceListElements {

	public static void main(String[] args) {
		//replace the elements that has value 1 to 8
	      ArrayList<Integer> list = new ArrayList<Integer>();
	      list.add(1);
	      list.add(2);
	      list.add(7);
	      list.add(1);
	      list.add(3);
	      list.add(1);
	      // we have the list as first parameter than elements we wanna change
	      Collections.replaceAll(list, 1, 8);
	      
	}
}