package practicemock8_2;

public class PractArray {

	public static void main(String[] args) {

		int [] a = { 56,4,323,556,7,8,3,24,5466,343353,66,7889,909,877,665,5,32,2};
		int temp;
		for (int i =0; i<a.length; i++) {
			
			for (int j=i+1; j<a.length; j++) {
				if (a[i]>a[j]) {
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
					
					
				}
			}
			System.out.print(a[i]+" ");
		}
	}

}
