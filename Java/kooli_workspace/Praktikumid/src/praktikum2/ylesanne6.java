package praktikum2;

import lib.TextIO;

public class ylesanne6 {
	public static void main(String[] args){
		String input;
		
		System.out.println("Kirjuta mingi tekst:");
		
		input = TextIO.getlnString();
		
		System.out.println(input.replace("a", "_"));
		
	}
}
