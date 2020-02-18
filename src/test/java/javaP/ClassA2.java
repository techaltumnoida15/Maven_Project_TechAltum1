package javaP;

public class ClassA2 extends ClassA1{

	public ClassA2() {
		System.out.println("Delhi");
	}
	
	public void method1() {
		super.method1();
		System.out.println("Python");
	}
	
	public static void main(String[] args) {
		ClassA2 obj = new ClassA2();
		
		obj.method1();
	}
}
