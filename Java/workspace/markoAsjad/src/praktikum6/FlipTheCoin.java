package praktikum6;

import java.util.Scanner;
import java.util.Random;

public class FlipTheCoin {
	public static void main(String[] args) {
		int cash = 100;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("What's your bet? " + 0 + " - " + cash);
			int bet = input.nextInt();
			if (throwcoin()) {
				cash += bet * 2;
				System.out.println("Heads! Here's your cash:\n" + cash);
			} else {
				cash -= bet;
				System.out.println("Tails :( Here's your cash:\n" + cash);
			}
		} while (cash != 0);
		
		input.close();
	}

	public static boolean throwcoin() {
		Random randomizer = new Random();
		int flip = randomizer.nextInt(2);
		if (flip == 1) {
			return false;
		}
		return true;
	}

}
