package praktikum3;

import java.util.Scanner;

public class ArtificialIntelligence {
	
	public static void main(String[] args){
	
		int age1, age2, agediff;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How old are you?");
		age1 = InputChecker.getAge();
		System.out.println("How old is he/she?");
		age2 = InputChecker.getAge();
		
		agediff = age2 - age1;
		
		if(Math.abs(agediff) >= 10){
			System.out.println("REALLY?");
		} else if(Math.abs(agediff) >= 5){
			System.out.println("Really?");
		} else {
			System.out.println("That's okay I guess");
		}
	
		input.close();
	}
}
