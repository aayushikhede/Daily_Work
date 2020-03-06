import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import com.sun.javafx.collections.MappingChange.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(12345, "rahul$$");
		map.put(12346, "ram@@");
		map.put(12347, "ram$@$");
		for(Entry<Integer, String> entry :map.entrySet())
		{
		//System.out.println(entry.getKey()+"and value");
			
			System.out.println(entry.getKey()+"--->"+entry.getValue());
		}
		System.out.println("end of main");
	}

}
