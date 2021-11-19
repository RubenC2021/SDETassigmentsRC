package assingment4;

import java.util.HashSet;
import java.util.Set;

public class Exercise5 {
	//5. Copy all elements of a HashSet to an Object array. 

	public static void main(String[] args) {
		Set<Integer> hashset = new HashSet<Integer>();
		hashset.add(20);
		hashset.add(21);
		hashset.add(30);

	      
	      System.out.println("Elements in hashset = " + hashset);
	      System.out.println("Copying all elements from hashset to object array...");
	      
	      Object[] myArray = hashset.toArray();
	      for (Object item : myArray)
	      System.out.println(item);
	}
}
