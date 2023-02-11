package array;

public class SortingInAscending {
	
	public static void main(String[] args) {
		
		int [] a = { 11,2,3,7,6,99,87,66,554,433,2,4,77,66,34,54,677,4567,44,33,56,7,9,9,33,67,889,667,78};
		int empty;
		
		for (int i = 0; i<a.length; i++ ) 
		{
			for(int j = i+1; j<a.length; j++)
			{
				if (a[i]>a[j])
				{
					empty = a[i];
					a[i]=a[j];
					a[j]=empty;
				}
			}
			System.out.print(a[i] + " ");
		}
	}

}
