package praktikum5;

import java.util.Scanner;

public class Meetodid {

	public static void main(String[] args) {

		// System.out.println(cubed(3));

		betweenInts(1, 10);

	}

	public static double cubed(int num) {

		return Math.pow(num, 3);
	}

	public static void betweenInts(int a, int b) {

		Scanner input = new Scanner(System.in);
		int number = 0;

		do {
			System.out.println("Enter a number");
			number = input.nextInt();

		} while (number > b || number < a);

	}
	
//	public static void headsTails
}
