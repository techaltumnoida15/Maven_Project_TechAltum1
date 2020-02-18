package javaP;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {

	public void setExample() {
		
		//List<String> myList = new ArrayList<String>();
		
		//Dec a Set
		Set<String> mySet = new HashSet<>();
		mySet.add("A");
		mySet.add("A");
		mySet.add("A");
		mySet.add("B");
		mySet.add("A");
		mySet.add("C");
		mySet.add("T");
		mySet.add("S");
		
		System.out.println(mySet);
		
	}
	
	public static void main(String[] args) {
		SetExample obj = new SetExample();
		obj.setExample();
	}
}
