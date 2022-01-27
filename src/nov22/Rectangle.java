package nov22;
/*
Type a program which calculates the area and the perimeter of a rectangle
whose length and with are entered by user.
Hint 1: Area of a rectangle is width x length
Hint 2: Perimeter of a rectangle is 2x (width + length)
*/
public class Rectangle {

	public static void main(String[] args) {
		
			int length = 12;
			int width = 15;
			int area = length*width;
			int perimeter = 2*length + 2*width;	
				System.out.println("For a rectangle with length "+ length+" width "+ width+" the area is "+area + " perimeter is "+ perimeter);
			}
	}

