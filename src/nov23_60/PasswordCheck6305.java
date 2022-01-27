package nov23_60;
/*
 Type java code by using if-else statement,
 if the password is “JavaLearner”, output will be “The password is true”.
O therwise, output will be “The password is false”.
 */

 import java.util.Scanner;

  public class PasswordCheck6305 {
public static void main(String[] args) {
	

	Scanner scan = new Scanner (System.in);
	
    System.out.println("Enter password");
		
	String pwd = scan.next();
	
	if(pwd.equals("JavaLearner")) {
	System.out.println("Password is true");	
	}else {
	System.out.println("Password is false");	
	}
	
 }	
}
