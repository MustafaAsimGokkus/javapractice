package nov22;

public class Swap {

	public static void main(String[] args) {
	
	int a = 6;
	int b = 17;
	
	a = a+b;
	b = a-b;
	a= a-b;		
	System.out.println("a is "+a + " b is "+ b); // a is 17  b is 6
		
	// Swap with 3rd variable
	
	int num1 = 5;
	int num2 = 66;
	int temp = 0;
	
	temp = num1;
	num1= num2;
	num2 = temp;
	
	System.out.println("num1 is "+num1 + " num2 is "+ num2); // num1 is 66 num2 is 5

	}

}
