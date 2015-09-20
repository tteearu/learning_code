package package1;

import java.util.Random;

public class Arrays {
	public static void main(String[] args){
		System.out.println(simpleArray());
		
		System.out.println("Face\tFrequency");
		for (int face=1;face<diceFreq().length;face++){
			System.out.printf("%s\t%s\n", face, diceFreq()[face]);
		}
	}
	public static int simpleArray(){
		int marko[] = {16,05,1990};
		int sum = 0;
		for (int i = 0; i<marko.length;i++){
			sum += marko[i];
		}
		return sum;
	}
	public static int[] diceFreq(){
		Random rand = new Random();
		int freq[] = new int[7];
		for (int roll=1;roll<1000;roll++){
			++freq[1+rand.nextInt(6)];
		}
		return freq;
	}
}
