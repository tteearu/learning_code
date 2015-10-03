package praktikum5;

import java.util.Random;
import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class Poker {

	public static void main(String[] args) {

		Card deck[] = initDeck();
		Card hand[] = drawCards(deck);

		System.out.println("Your hand is:");
		int handCounter = 1;
		for (Card card : hand) {
			System.out.printf("(%s)%s%S ", handCounter, card.face(), card.suite());
			handCounter++;
		}

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
		int[] handPositions = new int[5];
		int num = 0;

		for (int i = 0; i < 5; i++) {
			num = rand.nextInt(deck.length);
			hand[i] = deck[num];
			deck = ArrayUtils.remove(deck, i);

		}

		return hand;

	}

}
