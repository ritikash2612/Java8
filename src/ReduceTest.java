import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReduceTest {

	public static void main(String[] args) {

		// can use aggregate functions like min max sum etc.
		List<Integer> scores = Arrays.asList(1, 2, 3, 4);
		Stream<Integer> stream = scores.stream();

		// takes the stream and reduces the numbers by summing up the two numbers and
		// adding it to the default value supplied in the reduce which is zero in this
		// case
		Integer sum = stream.reduce(0, (s1, s2) -> s1 + s2);
	}

}
