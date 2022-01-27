package practice6;

import java.util.Scanner;

public class MarioBricksDifficultOne {

	public static void main(String[] args) {
	
		int h;	
		int c;
		int r;
		int s;
		
	do {
		Scanner scan = new Scanner (System.in);
        System.out.println("Enter height of pyramind between 2 and 10");
        h = scan.nextInt();
	} while (h<2 || h>10);
	
	  
	for (r =0; r<=h; r++) {
		
		for (s=0; s<h-r;s++) {
			System.out.print(" ");
		} for(int i=0; i<r;i++) {
			System.out.print("#");
		}
		  System.out.print("  ");
		
		for(int j =0; j<r; j++) {
			System.out.print("#");
		}
		
		
		
		
		System.out.println();
	   
	  }
	  
	}

}
