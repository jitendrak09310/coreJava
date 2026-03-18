package collectionsFramework;

import java.util.ArrayList;
import java.util.*;

public class Test {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		list.remove(Integer.valueOf(3));
		list.remove(0);
		System.out.println(list);
	}

}
