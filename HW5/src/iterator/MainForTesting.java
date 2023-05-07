package iterator;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainForTesting {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("one", "two", "three");
		Set<String> set = new TreeSet<>();
		set.addAll(Arrays.asList("B", "A", "D", "C", "E"));
		Combined<String> c = new Combined<>(set, list);
	for (String s : c) 
			System.out.print(s + " ");
	}

}
