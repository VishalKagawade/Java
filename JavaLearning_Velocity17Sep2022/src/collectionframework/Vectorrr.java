package collectionframework;
import java.util.Vector;
import java.util.Iterator;
public class Vectorrr {
	
	public static void main(String[] args) {
     Vector<String> list = new Vector<String>();
     
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
