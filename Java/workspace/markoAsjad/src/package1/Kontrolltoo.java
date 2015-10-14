package package1;

public class Kontrolltoo {
	
	public static void main(String[] args){
		System.out.println(-0.5e-2);
		int a = 4;

		int b = ++a / 5;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(summaKuup(2,3));
		System.out.println(posPaarisarv(0));
		
		System.out.println(valiVahemik(1));
	}
	
	public static double summaKuup(double a, double b){
		return Math.pow((a+b),3);
	}

	public static boolean posPaarisarv(int n){
		if (n > 0 && (n % 2 == 0)){
			return true;	
		}return false;
	}
	public static int valiVahemik(int m){
		if (m>35){
			return 2;
		}else if (m > 10){
			return 1;
		}else{
			return 0;
		}
	}
}
