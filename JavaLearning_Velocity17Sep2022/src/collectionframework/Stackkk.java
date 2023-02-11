package collectionframework;
import java.util.Stack;
import java.util.Iterator;

public class Stackkk {
	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.add("mango");
		stack.add("apple");
		stack.add("jackfruit");
		stack.add("mango");
		stack.add("chikuu");
		
		stack.pop();
		
		
		Iterator loop = stack.iterator();
		
		while(loop.hasNext()) {
			System.out.println(loop.next());
		}
		
	}

}
