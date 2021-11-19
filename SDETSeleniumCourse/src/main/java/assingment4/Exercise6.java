package assingment4;

import java.util.TreeSet;

public class Exercise6 {
//6. Get highest and lowest value stored in TreeSet 

	public static void main(String[] args) {
		TreeSet<Integer> tSet = new TreeSet<Integer>();
		   
	    //add elements to TreeSet
	    tSet.add(9);
	    tSet.add(3);
	    tSet.add(8);
	    tSet.add(1);
	    tSet.add(4);
	    
	    System.out.println("Lowest value: " + tSet.first());
	    System.out.println("Highest value: " + tSet.last());

	}

}
