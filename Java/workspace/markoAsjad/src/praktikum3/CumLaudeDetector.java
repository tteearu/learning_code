package praktikum3;

public class CumLaudeDetector {
	
	public static void main(String[] args){
		
		Double gpa, dissertation;
		
		System.out.println("Input your GPA:");
		gpa = InputChecker.getGrade();
		System.out.println("Input your Dissertation grade:");
		dissertation = InputChecker.getGrade();		
		
		if(gpa > 4.5 && dissertation == 5){
			System.out.println("Congratulations! You get a Cum Laude!");
		} else {
			System.out.println("Sorry, no Cum Laude for you");
		}
		
		
	}

}
