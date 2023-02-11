package array;

public class DuplicateValue {
	
	public static void main(String[] args) {
		
		int [] a = { 1,2,3,2,33,22,1,33,22,332,43};
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if ( a[i]==a[j]) 
					System.out.println(a[j]);
				
			}
		}
	}

}
