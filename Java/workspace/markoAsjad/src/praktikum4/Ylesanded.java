package praktikum4;

import java.util.Scanner;

public class Ylesanded {

	public static void main(String[] args) {
		// tenToOne();
		// evenNumbers();
		// divisableThree();
		// sevenBySeven();
		// printX();
		// numberTable();
		pinNumber();

	}

	public static void tenToOne() {
		// for (int i = 10; i > 0; i--){
		// System.out.println(i);
		int i = 10;
		while (i > 0) {
			System.out.println(i);
			i--;
		}
	}

	public static void evenNumbers() {
		int i = 0;
		while (i <= 10) {
			System.out.println(i);
			i += 2;
		}
	}

	public static void divisableThree() {
		for (int i = 0; i <= 30; i += 3) {
			System.out.println(i);
		}
	}

	public static void sevenBySeven() {
		for (int i = 0; i < 7; i++) {
			int row[] = new int[7];

			for (int j = 0; j < 7; j++) {
				row[j] = 0;
			}
			row[i] = 1;
			for (int num : row) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

	public static void printX() {
		Scanner input = new Scanner(System.in);
		System.out.println("How big should the table be?");
		int size = input.nextInt();

		String row[] = new String[size * 2 + 3];
		for (int j = 0; j < size * 2 + 3; j++) {
			row[j] = "-";
		}
		for (String num : row) {
			System.out.print(num);
		}
		System.out.println();

		for (int i = 0; i < size; i++) {
			String numrow[] = new String[size];
			int j = 0;
			while (j < size) {
				if (j == i || j == size - i - 1) {
					numrow[j] = "x";
					j++;
				} else {
					numrow[j] = "0";
					j++;
				}
			}
			System.out.print("| ");
			for (String num : numrow) {
				System.out.print(num + " ");
			}
			System.out.print("|");
			System.out.println();
		}
		for (int j = 0; j < size * 2 + 3; j++) {
			row[j] = "-";
		}
		for (String num : row) {
			System.out.print(num);
		}
		input.close();
	}

	public static void numberTable() {
		int tablesize = 10;
		int row[] = new int[tablesize];
		int j = 0;

		while (j < tablesize) {

		}
		for (int i = 0; i < tablesize; i++) {
			row[i] = i;
		}

		for (int num : row) {
			System.out.print(num + " ");
		}

	}

	public static void pinNumber() {
		int pin = 10000;

		for (int i = 0; i < pin; i++) {
			if (i < 10) {
				System.out.println("000" + i);
			} else if (i < 100) {
				System.out.println("00" + i);
			} else if (i < 1000) {
				System.out.println("0" + i);
			} else {
				System.out.println(i);
			}
		}
	}
}
