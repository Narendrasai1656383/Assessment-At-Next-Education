package Assessment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Seven {

	public static void main(String[] args) {
		Map<Integer,Integer> map=new HashMap<>();
		map.put(1,40);
		map.put(2,10);
		map.put(3,30);
		System.out.println("Map before sorting:\n"+map);
		List<Map.Entry<Integer,Integer>> lmap=new ArrayList<>(map.entrySet());
		Collections.sort(lmap,(a,b)-> a.getValue()-b.getValue());
		System.out.println("Map after sorting:\n"+lmap);
	}

}
