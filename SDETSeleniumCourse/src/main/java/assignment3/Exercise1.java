package assignment3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Exercise1 {

	//1. Write a program to print the occurrence of each character in the String 
	static String str = "DevLabs Alliance Training";
	static char charStr[] =str.toCharArray();
	public static void main(String[] args) {
		Map<Character,Integer> myMap = new HashMap<>();
		//To find the number of occurence
		int value = 0;
		for(char c:charStr) {
			if(myMap.containsKey(c)) {
				value=myMap.get(c);
				myMap.put(c, value+1);
			}else {
				myMap.put(c, 1);
			}
		}
		//To print the values
		int max =0;
		for (Integer i : myMap.values()) {
			if(max < i) {					
				max = i;
			}			
		}
		Set<Entry<Character, Integer>> entrySet = myMap.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			if(entry.getValue() == max) {
				System.out.println(entry.getKey() +" :"+ entry.getValue()  + " occurences");
			}
		}
		
	}

}
