package package1;

import java.util.Scanner;

public class Scanners {
	public static void main(String[] args) {
		System.out.println("Enter an input");
		Scanner marko = new Scanner(System.in);
		System.out.println("Input was: " + marko.nextLine());
		marko.close();
	}
}
