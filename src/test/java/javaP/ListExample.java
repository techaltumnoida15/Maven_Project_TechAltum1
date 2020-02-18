package javaP;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class ListExample {

	@Test
	public void listExample() {

		//Declare Array
		String[] arr = new String[3];
		
		String[] arr1 = {"A", "B", "C"};
		
		
		//===================================
		
		//Declare ArrayList
		List<String> myList = new ArrayList<String>();    //Default size is 10
		
		myList.add("A");
		myList.add("B");
		myList.add("B");
		myList.add("C");
		myList.add("D");
		myList.add("F");
		myList.add("T");
		//myList.add(2);
		
		//myList.
		
		System.out.println(myList);
		
		String s1 = myList.get(2);
		System.out.println(s1);
		
		System.out.println(myList.size());
		
		myList.remove(4);
		
		System.out.println(myList);
		
		//============================
		
		ArrayList arrList = new ArrayList<>();
		arrList.add("A");
		arrList.add(2);
		
		System.out.println(arrList);
		
		
		
		
		
	}
}
