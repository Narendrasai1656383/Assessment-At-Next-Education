package Assessment;

import java.util.HashMap;
import java.util.Map;

public class Five {

	public static void main(String[] args) {
		String s="swiss";
		System.out.println("Given input string: "+s);
		Map<Character,Integer> map=new HashMap<>();
		for(char ch:s.toCharArray()) {
			map.put(ch,map.getOrDefault(ch,0)+1);
		}
		boolean flag=false;
		for(char ch:s.toCharArray()) {
			if(map.get(ch)==1) {
				System.out.println("First non repeated char: "+ch);
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println("No such character in given string which only occurs once");
		}
	}

}
