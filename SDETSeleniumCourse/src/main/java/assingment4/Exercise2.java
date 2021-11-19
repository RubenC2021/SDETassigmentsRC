package assingment4;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise2 {

	public static void main(String[] args) {
		//Exercise 5. Reverse an Arraylist
		
		ArrayList<String> names = new ArrayList<>();
		names.add(0,"Ruben");
		names.add(1,"Betsua");
		names.add(2,"Joshua");
		names.add(3,"Noa");
		names.add(4,"Rebeca");
				System.out.println("Arraylist in reverse");
				for (int i = names.size()-1; i >=0; i--) {
					System.out.print(names.get(i) + ",");
				}
				
				System.out.println("");
				System.out.println("Arraylist in reverse using Collections.reverse");
				Collections.reverse(names);
				System.out.println(names);
	}

}
