package atm_project_hashset_linkedhashset;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {
  
	/*
	 
	i)If you use LinkedList constructor to create an object in Queue 
	  data type elements will be in insertion order. 
	ii)If you use PriorityQueue constructor to create an object in
	  Queue data type elements will be in order according to the rule
	  the Java decided.But we are able to create our own rules to sort
	  elements (topic of Lambda course)
 
	 */
	

	public static void main(String[] args) {
	
    Queue<String>q1 = new LinkedList<>();
    System.out.println(q1.offer("A"));//true
    System.out.println(q1);//[A]
  
  
    Queue<String>q2 = new PriorityQueue<>();
   //Deque ==> double ended queue fifo and lifo
  
	}

}
