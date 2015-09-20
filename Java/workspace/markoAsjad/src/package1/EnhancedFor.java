package package1;

public class EnhancedFor {
	
	public static void main(String[] args){
		int marko[] = {1,2,3,4,5,6,7,8,9};
		int total = 0;
		
		
//		this is cool
		for(int x: marko){
			total +=x;
		}
	
		System.out.println(total);
		
		String alsoMarko[] = {"hi ","hurlo thar ","how ya doin"};
		String alsoTotal = "";
		
		for(String x: alsoMarko){
			alsoTotal += x;
		}
	
		System.out.println(alsoTotal);
	}

}
