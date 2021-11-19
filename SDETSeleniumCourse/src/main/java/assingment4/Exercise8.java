package assingment4;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise8 {
	//7. Sort ArrayList of Strings alphabetically. 

	public static void main(String[] args) {
		ArrayList<String> myArrList = new ArrayList<>();
		
		myArrList.add("Ruben");
		myArrList.add("Ana");
		myArrList.add("Steve");
		
		System.out.println("Before sorting arrayList: " + myArrList);
		
		Collections.sort(myArrList);
		System.out.println("Sorted arrayList: " + myArrList);

	}

}
