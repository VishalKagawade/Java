package array;


public class ChekArrayEncaps {
	
	public static void main(String[] args) {
		int [] c = ArrayInGetMethod.getarray();
		for(int i=0; i<c.length; i++)
			System.out.println(ArrayInGetMethod.getarray()[i]);
	}

}
