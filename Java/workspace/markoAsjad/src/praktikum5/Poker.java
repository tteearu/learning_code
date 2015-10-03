package praktikum5;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

import org.apache.commons.lang3.ArrayUtils;

public class Poker {

	public static void main(String[] args) {

		Card hand[] = {};
		Scanner input = new Scanner(System.in);
		Card deck[] = initDeck();
		hand = drawCards(deck, hand, 5);
		deck = refreshDeck(deck, hand);

		printHand(hand);

		System.out.println("\nHow many cards do you wish to change?:");

		int changenumbers = input.nextInt();

		for (int i = 0; i < changenumbers; i++) {
			System.out.printf("Please enter card number %s:\n", i + 1);
			hand = ArrayUtils.remove(hand, input.nextInt() - 1);
		}

		hand = drawCards(deck, hand, changenumbers);

		printHand(hand);
		input.close();

	}

	public static void printHand(Card hand[]) {
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

	public static Card[] drawCards(Card deck[], Card hand[], int n) {
		Card newhand[] = new Card[n + hand.length];
		Random rand = new Random();
		int num = 0;

		if (hand.length != 0) {
			for (int x = 0; x < hand.length; x++) {
				newhand[x] = hand[x];
			}
		}

		for (int i = hand.length; i < 5; i++) {
			num = rand.nextInt(deck.length);
			newhand[i] = deck[num];
			deck = ArrayUtils.remove(deck, num);

		}

		return newhand;

	}

	public static Card[] refreshDeck(Card deck[], Card hand[]) {

		for (Card card : hand) {
			int index = Arrays.asList(deck).indexOf(card);
			deck = ArrayUtils.remove(deck, index);
		}

		return deck;
	}

}
