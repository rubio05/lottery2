package Plays;

import java.util.Random;

public class Pick2{
	int num1;
	int num2;
	
	
	public Pick2() {
		
		
	}
	
	public void Generate_Numbers() {
		Random random = new Random();
		
		num1 = random.nextInt(9);
		num2 = random.nextInt(9);
		System.out.println("The winners numbers PICK 2 are:" + "(" + num1 + " , " + num2 + ")");
	}
	
}
