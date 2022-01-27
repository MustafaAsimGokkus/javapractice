package atm_project_hashset_linkedhashset;

public class Armstrong {
 /* I got bored of typing  scanner */
	public static void main(String[] args) {
		String toBeCheckedIfArmstrong = "370";
	    Integer a = Integer.parseInt(toBeCheckedIfArmstrong);
		int sum = 0;
	
	    for(int i=0;i<toBeCheckedIfArmstrong.length();i++) {
	    /*using char as its representing value. Not ASCII value!*/	
		int num1 = Character.getNumericValue(toBeCheckedIfArmstrong.charAt(i));
 	    sum += Math.pow(num1, 3);
 	   
	    }
      String result= sum==a ? toBeCheckedIfArmstrong+" is Armstrong number!": 
    	                  toBeCheckedIfArmstrong+" is not Armstrong number!";
      System.out.println(result);
  }
}