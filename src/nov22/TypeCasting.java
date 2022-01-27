package nov22;

public class TypeCasting {

	public static void main(String[] args) {
	
		int x = 0;
		while (++x<5) {x+=1;}
		String message = x>5 ? "Greater than" : "Less than";
       System.out.println(message + x);
	}

}
