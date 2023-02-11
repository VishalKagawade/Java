package collectionframework;

import java.util.PriorityQueue;

public class Queueee {
	
	public static void main(String[] args) {
		PriorityQueue<String> ob = new PriorityQueue<String>();
		
		ob.add("mango");
		ob.add("apple");
		ob.add("chikoo");
		ob.add("jackfruit");
		ob.add("mango");
		ob.offer("grapes");
		
		System.out.println("Head -" + ob.peek());
		
		for(String s:ob)
			System.out.println(s);
	}

}
