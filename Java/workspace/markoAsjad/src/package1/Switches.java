package package1;

public class Switches {

	public static void main(String[] args){
		
		int age;
		age = 0;
		
		switch (age){
		case 1:
			System.out.println("You can crawl");
			break;
		case 2:
			System.out.println("You can talk");
			break;
		case 3:
			System.out.println("You can drive");
			break;
		default:
			System.out.println("You havent been born");
			break;
		}
	}
	
}
