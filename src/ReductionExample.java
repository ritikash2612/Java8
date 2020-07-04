import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReductionExample {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 10, 10);
		List<Integer> list2 = Arrays.asList(-10, -10);

		Integer red = list.stream().reduce(0, Integer::sum);
		Integer min = list2.stream().reduce(0, Integer::max);
		System.out.println(red);
		// takes min from 0, -10 and -10, zero effects the result.
		System.out.println(min);

		// on order to solve the issue in computation due to identity, we can use
		// Optional
		// optionals do not require identity and returns value wrapped in an optional.

		Optional<Integer> o = list2.stream().reduce(Integer::max);
		System.out.println(o); // now gives the correct result
	}

}
