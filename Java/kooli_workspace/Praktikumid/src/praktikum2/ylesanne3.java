package praktikum2;

import lib.TextIO;

public class ylesanne3 {

	public static void main(String[] args){
		int people, groupSize;
		
		System.out.println("Kui palju inimesi on?");
		people = TextIO.getInt();
				
		System.out.println("Kui palju inimesi on grupis?");
		groupSize = TextIO.getInt();
		
		System.out.println("Kokku saab moodustada " + people/groupSize +" gruppi ja inimesi jääb üle " +people%groupSize);
		
	}
}
