package praktikum6;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word = input.nextLine();
		
		for (int i= word.length(); i > 0; i--){
			System.out.print(word.charAt(i-1));
		}
	input.close();	
	}

}
