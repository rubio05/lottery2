package Plays;

import java.util.Random;

public class Pick4 extends Play{
	int num1;
	int num2;
	int num3;
	int num4;
	
	
	public Pick4() {
		
		
	}
	
	public void Generate_Numbers() {
		Random random = new Random();
		
		num1 = random.nextInt(9);
		num2 = random.nextInt(9);
		num3 = random.nextInt(9);
		num4 = random.nextInt(9);
		System.out.println("The winners numbers PICK 4 are:" + "(" + num1 + " , " + num2 + " , " + num3 + " , " + num4 + ")");
	}
}
