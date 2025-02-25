package Assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Two {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>(Arrays.asList(1,2,2,4,3,5,6,3,7,7,5,3,2));
		Optional<Integer> sech=l.stream().distinct().sorted((a,b)->b-a).skip(1).findFirst();
		if(sech.isPresent())
		System.out.println(sech.get());
	}

}
