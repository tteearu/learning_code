package package1;

public class VariableLengthArguments {

	public static void main(String[] args) {
		System.out.println(average(1, 2, 3, 4, 5, 6));
	}

	public static int average(int... numbers) {
		int total = 0;
		for (int x : numbers)
			total += x;

		return total / numbers.length;
	}
}