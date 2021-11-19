package assingment4;

import java.util.HashMap;
import java.util.Map;

public class Exercise3 {

	public static void main(String[] args) {
		Map<Integer, String> myMap = new HashMap<>();
		
		myMap.put(1, "Apple");
		myMap.put(2, "Banana");
		myMap.put(3, "Pineaple");
		int keyToSearch = 3;	
		boolean isKeyPresent = myMap.containsKey(keyToSearch);
		
		String message = (isKeyPresent) ? "Key " + keyToSearch + " is present" : "Key " + keyToSearch + " is NOT present";
		System.out.println(message);
	}
}
