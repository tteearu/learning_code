package package1;

public class TimeClass {
	public static void main(String[] args) {

		TimeClassHelper timeObject = new TimeClassHelper();

		System.out.println(timeObject.toMilitary());
		System.out.println(timeObject.toString());	
		
		timeObject.setTime(17, 45, 3);
		
		System.out.println(timeObject.toMilitary());
		System.out.println(timeObject.toString());
		
		
	}
}