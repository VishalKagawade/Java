package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListtt {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("mango");
		list.add("apple");
		list.add("jackfruit");
		list.add("mango");
		
		Iterator loop = list.iterator();
		
		while(loop.hasNext()) {
			System.out.println(loop.next());
		}

	}

}
