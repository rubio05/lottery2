package Plays;

import java.util.Random;

public class Fantasy5 {
	int num1;
	int num2;
	int num3;
	int num4;
	int num5;
	
	
	public Fantasy5() {
		
		
	}
	
	public void Generate_Numbers() {
		Random random = new Random();
		
		num1 = random.nextInt(99);
		num2 = random.nextInt(99);
		num3 = random.nextInt(99);
		num4 = random.nextInt(99);
		num5 = random.nextInt(99);
		System.out.println("The winners numbers FANTASY 5 are:" + "(" + num1 + " , " + num2 + " , " + num3 + " , " + num4 + " , " + num5 + ")");
	}
}
