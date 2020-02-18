package javaP;

public class ClassA4 {

	private ClassA4() {
		
	}
	
	public static ClassA4 getInstance() {
		ClassA4 obj = null;
		
		if(obj == null) {
			
			 obj = new ClassA4();
		}
		
		return obj;
	}
	
	public static void main(String[] args) {
		ClassA4 object = ClassA4.getInstance();
		
		ClassA4 object1 = ClassA4.getInstance();
	}
}


