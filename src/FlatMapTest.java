import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FlatMapTest {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> list2 = Arrays.asList(2, 4, 6);
		List<Integer> list3 = Arrays.asList(3, 5, 7, 9);

		List<List<Integer>> list = Arrays.asList(list1, list2, list3);
		System.out.println(list);

		// a function that takes a list of some type and returns an INTEGER
		Function<List<?>, Integer> size = List::size;
		
		// TAKES a list and returns a stream of Integer
		Function<List<Integer>, Stream<Integer>> flatMapper = l -> l.stream();
		
		// use flatMap to returned a flattened stream
		// map will return simple stream objects as it does not contain any toStream method
		list.stream().flatMap(flatMapper).forEach(System.out::println);

	}

}
