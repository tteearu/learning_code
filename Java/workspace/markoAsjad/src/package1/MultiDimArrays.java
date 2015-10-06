package package1;

public class MultiDimArrays {
	public static void main(String[] args) {
		int firstarray[][] = { { 8, 9, 10, 11 }, { 12, 13, 14, 15 } };
		int secondarray[][] = { { 30, 31, 32, 33 }, { 43 }, { 4, 5, 6 } };

		display(secondarray);
		display(firstarray);
		
	}

	public static void display(int x[][]) {
		for (int row = 0; row < x.length; row++) {
			for (int column = 0; column < x[row].length; column++) {
				System.out.print(x[row][column] +"\t");
			}
			System.out.println();
		}
	}
}
