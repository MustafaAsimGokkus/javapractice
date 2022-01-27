package familyproject01;

import java.util.*;;;;;;;;;;;;;;;;;;;;;;;;

public class Runner {
  public static void main(String[] args) {
	
	
	
	Father father = new Father();
	father.setName("Murat");
	father.setLastname("Nguyen");

	
	
	Product product = new Product();
	product.setName("camera");
	
	Product product2 = new Product();
	product2.setName("phone");
	
	List<Product> itemsToBuy = new ArrayList<>(); // list ofthe products we wanna buy
	itemsToBuy.add(product);
	itemsToBuy.add(product2);
	
	System.out.println("size of list of items to by:"+ itemsToBuy.size());
	
	Requirement req = new Requirement (itemsToBuy);
	father.setRequirement(req);
	System.out.println(shoppingCenter(father));
	
	
	
	
	
	
	Son son = new Son();
	son.setName("Usame");
	son.setLastname("Nguyen");
	son.setHappy(true);
	System.out.println(father);
	
	System.out.println("Father's current budget: "+ Father.budget);
	father.buyProduct(200); //4800
	System.out.println("Father's current budget: "+ Father.budget);
	
	son.buyProduct(500);
	
	System.out.println("Father's current budget: "+ Father.budget);//4300
	father.savedMoney-=200;
	System.out.println(father.savedMoney);//2800
	
	son.savedMoney-=100;
	System.out.println(son.savedMoney);//2700);
	
  }
  
  public static List<Product> shoppingCenter(Father father){
	 List<Product> boughtItems  = new ArrayList<>();
	 
	 String items = "camera, grenade, phone, cucumber, TV, tomatoes, meat, shovel, iceberg, pen, pencil, mathbook";
	 String prices="500,1500,600,3,5,10,20,3,1,1,25";
	 
	 String[] itemsArray=items.split(", ");
	 String[] pricesArray=items.split(", ");
	 
	
	 
	 List<Product>currentList = father.getRequirement().getList();
	 for(Product each:currentList) {
		                                         
		for (int i =0; i<itemsArray.length;i++) {// "each" is a list..we are working on this list (Product reference)
			if(each.getName().equalsIgnoreCase(itemsArray[i].trim())) {//each:father.getRequirement().getList();
			
			if(father.getBudget()>Double.parseDouble(pricesArray[i].trim())) {
				
				Product product = new Product();
				product.setName(itemsArray[i].trim());
				product.setPrice(Double.parseDouble(pricesArray[i].trim()));
				boughtItems.add(product);
				
				father.budget -= Double.parseDouble(pricesArray[i].trim());
				break;
					
			}else {
				System.out.println("Budget is not sufficient");
			}
				
				
			}
		}
		 
	 }
	 
	 
	 
	 
	  return boughtItems;
  }
  

}