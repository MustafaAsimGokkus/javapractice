package dec22;

public class Fibo {
	
	
	
	public static void main(String[] args) {
			
		int n1=0, n2=1, n3;
		int n=10;	
	
		
		for (int i=0; i<n ; i++) {
			n3 =n1 +n2;
			//System.out.print(n1+" ");
			n1=n2;
			n2=n3;
		
	}

	System.out.println(n1);
	}
   
}
