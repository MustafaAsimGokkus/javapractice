package day31MapsRepetition;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
  /*
   1)Maps use key-value structure.
   2)keys must be unique  values can be duplicated.
   3)keys cannot be null except "HashMaps. 
   4)HashMaps can use "null" just once.
   5)HashMaps does not put the elements in order because of that HashMap is super fast.
   6)If you try to send into a map repeated key Java will overwrite. 
   7)HashMap is not thread-safe and not synchronized
   
   
  
   
   */
	public static void main(String[] args) {
	//How to put elements into a HashMap
   HashMap<Integer,String>hm1 = new HashMap<>();
   hm1.put(100, "Ali");
   hm1.put(101, "Veli");//After 2 lines a new value for key 101 "Veliye" is entered
   hm1.put(100, "Aliye");
   hm1.put(101, "Veliye");
   hm1.put(null, "Mary");
   hm1.put(null, "Kemal");
   hm1.put(104, null);
   hm1.put(105, null);
   hm1.put(106, "");
   hm1.put(999, "Zehra");
   HashMap<Integer,String>hm2 = new HashMap<>();
   hm2.put(87, "X");
   hm2.put(88, "Y");
   hm2.put(89, "Z");
   
   hm1.putAll(hm2);//It puts all elements of hm2 to hm1 by ignoring order
   //when you use putAll() method data types of keys and values must match..Otherwise you get compile time error.
   System.out.println(hm1);  //{null=Kemal, 100=Aliye, 101=Veliye, 87=X, 104=null, 88=Y, 105=null, 89=Z, 106=}
                             //Java will put Z if 102 key does not exist in the map.102 exists in the map
                             // because of that java did not put it in the map.
   hm1.putIfAbsent(102, "Z");//put if key is absent. if there is no key like "102" otherwise do not put
   
   //How to get data from a map
   String el1 = hm1.get(101);
   System.out.println(el1);
   //If you use non existing key get() returns "null".
   String el2 = hm1.get(111);// non existing key
   System.out.println(el2);//null
   
   String el3=hm1.getOrDefault(111, "there is no key like that..");
   //get the value in key 111.if there is no key like that return the string
   System.out.println(el3);
   //keySet() returns all keys in a Set Collection
   
   Set<Integer>myKeys = hm1.keySet();
   System.out.println(myKeys);
   System.out.println(hm1.values());
    
   //How to update a value in a map
   Set <Map.Entry<Integer,String>> setFrmMap = hm1.entrySet();
   for (Map.Entry<Integer,String> w : setFrmMap) {
	   System.out.print(w+" ");
   }
   
   
   
   
   
   
   
   String val1= hm1.replace(999, "Zehra");
   System.out.println(val1);
   
   boolean val2 = hm1.replace(89, "L", "Leyla");
   System.out.println(val2);
   
   //how to remove an element from a Map
   System.out.println(hm1.remove(87));//X remove() returns the removed element
   
   boolean val4 = hm1.remove(null, "Kemal");
   System.out.println(val4);
   
  
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
	}

}
