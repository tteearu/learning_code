package praktikum3;

import java.util.Scanner;

public class InputChecker {
	
	static Scanner input = new Scanner(System.in);
	
	public static double getGrade(){
			
			boolean goodinput = false;
			double grade = 0;
			
			do {
				try {
					goodinput = true;
					grade = input.nextDouble();
				
				if ((grade < 0) || grade >5){
					System.out.println("Input is incorrect. Try again.");
					goodinput = false;
				}
			} catch (Exception e) {
				System.out.println("Input is not a boolean, try again.");
				goodinput = false;
				String clear = input.nextLine();
			} 
			} while (!goodinput);
			
			return grade;
		}
	
	public static int getAge(){
		
		boolean goodinput = false;
		int age = 0;
		
		do {
			try {
				goodinput = true;
				age = input.nextInt();	
			if (age < 0){
				System.out.println("Input is incorrect. Try again.");
				goodinput = false;
				}
			} catch (Exception e) {
				System.out.println("Input is not an int, try again.");
				goodinput = false;
				String clear = input.nextLine();
			} 
		} while (!goodinput);		
		
		return age;
	}
}
