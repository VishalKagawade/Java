package string;

public class StringBase {
	
	public static void main (String [] args) {
		
		String s1 = new String ("vishal");   // declaring string using new keyword
		String s2 = new String("vishal");
		
		// if we declare string by using new keyword then it will create object in heap memory and String constant pool area
		// ( if same content object is not available)
		
		String S3 = "vishal";
		String S4 = "Vishal";   // declaring a string by using string literals
		
		// if we declare string using using string literals it will create an object in string constant pool are ( if same 
		// string content object is not available) 
		
		// however if same string content object is already present in string constant pool area then JVM will not 
		// create a new object rather it will point to object where same content is available.
		
		//S3 ="vishu";
		
		System.out.println(S3);
	}

}
