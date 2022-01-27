package atm_project_hashset_linkedhashset;

public class ChristmasTree {

	public static void main(String[] args) {
		/*
		  Type code to write given christmas tree on the console. Get height from user
		  If height is 5:
		  
		   * *
		  ** **
		 *** ***
		**** ****
	   ***** *****        
	                         */
	
	
	
	int h=5;
	int r,c,x,y;
	
	for (r=0;r<h ; r++) { // create empty 5 lines
		
		for (c=0 ;c<h-r-1;c++){
			System.out.print(" ");
		}
		
		for (x=0;x<r+1;x++) {
			System.out.print("*");                   
		}
		                                          
		System.out.print("  ");
		//
		for (x=0;x<r+1;x++) {
			System.out.print("*");                   
		}
		
		
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
