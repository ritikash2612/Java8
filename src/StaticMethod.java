
public interface StaticMethod {

	// one can add a static method in the interface now. has a body not just the
	// declaration
	public static String getMessage() {
		return "Hi There!";
	}

	// another method with body -- Default method
	public default void testDefault() {
		System.out.println("This is a default method of the Interface.");
	}
}
