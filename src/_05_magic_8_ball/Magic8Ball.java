//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _05_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
private static int radomNumber;

public static void main(String[] args) {
	

	// 1. Make a main method that includes all the steps below….
	Random ran=new Random();
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	int num=ran.nextInt(4);
	// 3. Print out this variable
	System.out.println(num);
	// 4. Get the user to enter a question for the 8 ball
	JOptionPane.showInputDialog("enter a question");
	// 5. If the random number is 0
	if (radomNumber==0) {
	// -- tell the user "Yes"
	JOptionPane.showMessageDialog(null,"yes");
	}
	// 6. If the random number is 1
	if (radomNumber==1) {
	// -- tell the user "No"
	JOptionPane.showMessageDialog(null,"no");
	}
	// 7. If the random number is 2
	if (radomNumber==2) {
	// -- tell the user "Maybe you should ask Google?"
	JOptionPane.showMessageDialog (null,"Made you shold ask googe");
	}
	// 8. If the random number is 3
	if (radomNumber==3) {
	// -- write your own answer
	JOptionPane.showMessageDialog(null,"write youre own answear");
	}
}
}