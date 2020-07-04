import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachTest {

	public static void main(String... args) {

		List<String> str = Arrays.asList("one", "two", "three", "four", "five");

		List<String> res = new ArrayList<>();
		
		// Consumer - a functional Interface takes an object does not return anything
		// lambda expression using method reference  ::
		Consumer<String> c1 = System.out::println;
		str.forEach(c1);

		Consumer<String> c2 = res::add;
		
		str.forEach(c2);
		System.out.println(res);
		str.forEach(c1.andThen(c2));
		System.out.println(res);
	}

}
