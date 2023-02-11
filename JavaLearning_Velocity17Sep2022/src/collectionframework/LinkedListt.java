package collectionframework;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListt {
	
	public static void main(String[] args) {
		LinkedList<String> list	= new LinkedList<String>();
		
		list.add("mango");
		list.add("apple");
		list.add("jackfruit");
		list.add("mango");
		
		Iterator loop =list.iterator();
		
		while(loop.hasNext()) {
			System.out.println(loop.next());
		}
	}

}
