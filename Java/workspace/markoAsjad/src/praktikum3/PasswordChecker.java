package praktikum3;

import java.util.Scanner;

public class PasswordChecker {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		String password = "Car";
		
		System.out.println("What's the password?");
		
		System.out.println(input.nextLine().equals(password) ? "That is absoletely correct!" : "WRONG");
		
	}

}
