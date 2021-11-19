package assingment4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise4 {

	public static void main(String[] args) {
		//4. Convert keys of a map to a list. 

		Map<Integer, String> myMap = new HashMap<Integer, String>();
		
		myMap.put(1, "Juan");
		myMap.put(2, "Andres");
		myMap.put(3, "Rene");
		
		ArrayList<String> valueList = new ArrayList<String>(myMap.values());
		System.out.println("List of values: " + valueList);
		
		ArrayList<Integer> keysList = new ArrayList<Integer>(myMap.keySet());
		System.out.println("List of keys: " + keysList);

	}

}
