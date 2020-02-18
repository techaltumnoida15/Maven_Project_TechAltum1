package javaP;

public class ClassA3 {

	int i = 10;
	
	public void method1(int i) {
		//i = i;
		this.i = i;
		System.out.println(i);
	}
	
	//this refers to current class object
	
	public static void main(String[] args) {
		ClassA3 obj = new ClassA3();
		obj.method1(15);
		
		ClassA3 obj1 = new ClassA3();
		
		ClassA3 obj3 = new ClassA3();
	}
	
}
