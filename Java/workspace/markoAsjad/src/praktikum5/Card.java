package praktikum5;

public class Card {
	
	private String suite;
	private int face;

	public Card(String a, int b) {
		suite = a;
		face = b;
	}
	
	public String suite(){
		return suite; 
	}
	
	public int face(){
		return face;
	}

}
