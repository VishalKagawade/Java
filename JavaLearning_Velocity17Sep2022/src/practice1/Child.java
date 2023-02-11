package practice1;

public class Child extends Parent {
	int a = 22;
	
	public Child(){
		super(56);
		System.out.println("I am child");
		System.out.println(super.a);//12
		
	}
	
    
	
	public static void main(String[] args) {
		new Child();
	}
	
	

}
