package LotteryProyect.LotteryMaven;

import java.util.Random;

import Plays.Fantasy5;
import Plays.JackPotTriplePlay;
import Plays.Pick2;
import Plays.Pick3;
import Plays.Pick4;
import Plays.Pick5;


public class lottery {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pick2 p2 = new Pick2();
		Pick3 p3 = new Pick3();
		Pick4 p4 = new Pick4();
		Pick5 p5 = new Pick5();
		Fantasy5 f = new Fantasy5();
		JackPotTriplePlay jp = new JackPotTriplePlay();

		p2.Generate_Numbers();
		p3.Generate_Numbers();
		p4.Generate_Numbers();
		p5.Generate_Numbers();
		f.Generate_Numbers();
		jp.Generate_Numbers(); 
		
	}

}
