package assingment4;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Exercise9 {

	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		
		ht.put("1", "Anakin");
		ht.put("2", "Luke");
		ht.put("3", "Leah");
		
	
		Set<String> st = ht.keySet();
		
		Iterator<String> it = st.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
