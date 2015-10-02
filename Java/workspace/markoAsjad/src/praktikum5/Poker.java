package praktikum5;

import package1.Tuna;
import java.util.Random;
import java.util.Arrays;

import org.apache.commons.lang.ArrayUtils;

public class Poker {

	public static void main(String[] args) {

		Card deck[] = initDeck();
		Card hand[] = drawCards(deck);

		int handCounter = 0;
		for (Card card : hand) {
			System.out.printf("%s%S\n", card.face(), card.suite());
			handCounter++;
		}

		// int cardCounter = 0;
		// for (Card card : deck) {
		// System.out.printf("%s%S\n", card.face(), card.suite());
		// cardCounter++;
		// }
		// System.out.println(cardcounter);
		//
		// System.out.print(deck[1]);

	}

	public static Card[] initDeck() {

		String suites[] = { "♥", "♦", "♣", "♠" };
		int faces[] = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
		Card deck[] = new Card[52];

		int counter = 0;
		for (int face : faces) {
			for (String suite : suites) {
				deck[counter] = new Card(suite, face);
				counter++;

			}
		}

		return deck;
	}

	public static Card[] drawCards(Card deck[]) {
		Card hand[] = new Card[5];
		Random rand = new Random();

		for (int i = 0; i < 5; i++) {
			int num = rand.nextInt(deck.length);
			hand[i] = deck[num];
			// deck = ArrayUtils.remove(deck,i);

		}

		return hand;

	}

}
