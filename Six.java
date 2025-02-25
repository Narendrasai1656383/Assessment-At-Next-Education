package Assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Six {

	public static void main(String[] args) {
		String[] arr=new String[] {"bat","tab","cat","act","dog"};
		System.out.println("Given input array:\n"+Arrays.deepToString(arr));
		Map<String,List<String>> map=new HashMap<>();
		for(String str:arr) {
			char[] ch=str.toCharArray();
			Arrays.sort(ch);
			String s=Arrays.toString(ch);
			if(!map.containsKey(s)) {
				map.put(s,new ArrayList<>());
			}
			map.get(s).add(str);
		}
		System.out.println("The resultant grouped anagrams are:\n"+map.values());
		
	}

}
