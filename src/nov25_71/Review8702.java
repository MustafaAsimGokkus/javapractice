package nov25_71;
/*
 Ask user to enter his kid’s name, if the name contains “a” output will be “This name contains ‘a’.”
 if the name contains “z” output will be “This name contains ‘z’.” Otherwise, output will be
 “This name contains neither ‘a’ nor ‘z’.”
 */
public class Review8702 {

	public static void main(String[] args) {
    
	String name = "dfsd efew";	
   boolean a = name.contains("a");
   boolean z = name.contains("z");
   if (a == true) {
	
	   System.out.println("Name contains a");
    
   }if (z == true) {
	 
	   System.out.println("Name contains z");
   
   }else if (a== false && z ==false) {
    	
	   System.out.println("This name contains neither ‘a’ nor ‘z’.");
    }
   
	}

}
