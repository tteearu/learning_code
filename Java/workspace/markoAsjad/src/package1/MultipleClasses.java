package package1;

import java.util.Scanner;

public class MultipleClasses {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		Tuna tunaObject = new Tuna("Niki");
//		tunaObject.simpleMessage();
		
//		System.out.println("Enter your name here: ");
//		String name = input.nextLine();
		
//		tunaObject.anotherMessage(name);
		
//		System.out.println("Enter the name of your first girlfriend here: ");
//		String gfName = input.nextLine();
		
//		tunaObject.setName(gfName);
		
		tunaObject.saying();
		
		input.close();
	}
}
