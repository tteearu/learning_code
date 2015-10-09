package praktikum6;

import java.util.Scanner;
import java.util.Random;

public class ThrowDice {
	public static void main(String[] args) {
		int cash = 100;
		Scanner input = new Scanner(System.in);
		int guess = 0;
		int bet = 0;

		do {

			do {
				System.out.println("What's your bet? " + 0 + " - " + cash);
				bet = input.nextInt();
			} while (!(bet > 0 && bet <= cash));

			do {
				System.out.println("And what's your guess? (1-6)");
				guess = input.nextInt();
			} while (!(guess > 0 && guess < 7));

			int diceThrow = throwDice();
			if (diceThrow == guess) {
				cash += bet * 6;
				System.out.printf("You guessed %s which was correct! You have %s\n", guess, cash);
			} else {
				cash -= bet;
				System.out.printf("Oops,you guessed %s and the throw was %s. You have %s\n", guess, diceThrow, cash);
			}
		} while (cash != 0);
		input.close();
	}

	public static int throwDice() {
		Random randomizer = new Random();
		int flip = randomizer.nextInt(6) + 1;
		return flip;
	}

}
