package practicemock9_2;

public class arrays2 {
	
	public static void main(String[] args) {
		
	int [][] a = new int [4][];
	a[0]= new int [] {11};
	a[1]= new int [] {11,22};
	a[2]=new int [] {11,22,33};
	a[3]= new int [] {11,22,33,44};
	
	for (int i =0; i<a.length; i++) {
		for (int j =0; j<a[i].length; j++)
			System.out.print(a[i][j] + " ");
		System.out.println("");
	}
		
	
	
	
	
	}
}
