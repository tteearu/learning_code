package praktikum6;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {
		int guess = 0;
		Random randomizer = new Random();
		Scanner input = new Scanner(System.in);
		int number = randomizer.nextInt(100);

		do {
			System.out.println("Guess the number!");
			guess = input.nextInt();
			if (guess < number) {
				System.out.println("Too low!");
			} else if (guess > number) {
				System.out.println("Too high!");
			} else {
				System.out.println("Wow, you got it!");
			}
		} while (guess != number);
		
		input.close();
	}

}
