import java.util.Arrays;

public class Challenge {
	/**
	 * Usage:
	 * Input string using quotes. Ex: "1 + 2"
	 */
	public static void main(String[] args) {
		// System.out.println("Input: " + Arrays.toString(args));
		String input = args[0];
		Calculator calculator = new Calculator(input);
		double result = calculator.getResult();
		System.out.println(result);
	}
}