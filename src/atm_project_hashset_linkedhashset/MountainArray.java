package atm_project_hashset_linkedhashset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MountainArray {

	public static void main(String[] args) {
		
		int[]arr1 = {0,2,5,15,35,21,13,10};
		
		
		int x = Integer.MIN_VALUE;
			
		for (int i =0; i<arr1.length; i++ ) {
			if(arr1[i]>x) {
				x=arr1[i];
			}
		} 
	    //System.out.println(x);
		
		 List<Integer> list1 = new ArrayList<Integer>();
	      for(Integer w:arr1) {
	         list1.add(w);

	      }	
	     // System.out.println(list1);
	      
	      int idx_max = list1.indexOf(x);
	     System.out.println(idx_max); 
	      int counter = 0;
	      for (int j=0; j<idx_max; j++) {
	    	if(list1.get(j)-list1.get(j+1) >0) {
	    		counter++;	
	    	}
	    		
          }
	      
	      for (int k= idx_max; k<list1.size()-2; k++) {
	    	 if(list1.get(k)-list1.get(k+1) <0) {
	    		counter ++; 
	    	 }
	      }
	     
	      String result = counter > 0 ? "It is not a mountain array" : "Bingo! It is a mountain array";
	      System.out.println(result);
	      
	      
  }
}