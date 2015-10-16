package praktikum7;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

public class Ylesanded {

	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args){
		
		int twoDim[][] = {{1,2,3,4},{10,11,12,13}};
		int compareInts[] = new int[twoDim.length];
		
		for (int i=0; i<twoDim.length;i++){
			compareInts[i] = returnHighest(twoDim[i]);
		}
	
		System.out.println(returnHighest(compareInts));
		
//		reverseNumbers();
		
//		alphabeticalNames();
		
	}
	
	public static void reverseNumbers(){
		
		System.out.println("Enter numbers separated by commas");
		
		String numbers = input.nextLine();
		
		String stringArray[] = numbers.split(",");
		
		int numbersArray[] = new int[stringArray.length];
		
		try{
			for (int i=0; i<numbersArray.length;i++){
				numbersArray[i] = Integer.parseInt(stringArray[i]);
			}
			for (int i=numbersArray.length; i>0;i--){
				System.out.print(numbersArray[i-1]+",");
			}
			
		} catch(Exception e){
			System.out.println("Error");
		}
	}
	
	public static void alphabeticalNames(){
		ArrayList<String> names = new ArrayList<String>();
		String inputName = "";
		do{
			System.out.println("Type a name");
			inputName = input.nextLine();
			if (inputName.length() > 0){
				names.add(inputName);
			}
		}while (inputName.length()>0);
		
		Collections.sort(names);
		
		for (String name:names){
			System.out.println(name);
		}
	}
	
	public static int returnHighest(int[] array){
		
		List b = Arrays.asList(ArrayUtils.toObject(array));
		
		return (int) Collections.max(b);
		
	}
}
