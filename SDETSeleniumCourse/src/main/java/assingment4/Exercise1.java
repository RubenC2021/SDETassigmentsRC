package assingment4;

import java.util.HashMap;
import java.util.Map;

public class Exercise1 {

	public static void main(String[] args) {
		// Exercise 3: print the duplicate characters from the given String?
				String str2 = "test string";
				HashMap<Character, Integer> myMapCount = new HashMap<>();
				for (int s = 0; s < str2.length(); s++) {
					if (!myMapCount.containsKey(str2.charAt(s)))
						myMapCount.put(str2.charAt(s), 1);
					else
						myMapCount.put(str2.charAt(s), myMapCount.get(str2.charAt(s)) + 1);
				}
				
				/* Print duplicates in sorted order */
				for (Map.Entry mapElement : myMapCount.entrySet()) {
					char key = (char) mapElement.getKey();
					int value = ((int) mapElement.getValue());

					if (value > 1)
						System.out.println(key + ", count = " + value);
				}
    }
}
