//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _03_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100);
		
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 
		String yeet = JOptionPane.showInputDialog("give guess(1-100)");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int poo = Integer.parseInt(yeet);
			// 5. if the guess is correct
				// 6. Win
			if(poo == random) {
				JOptionPane.showMessageDialog(null, "u won xd");
			}
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
				// 8. Tell them it's too high
			if(poo > random) {
				JOptionPane.showMessageDialog(null, "too high, u lose. answer = " + random);
			}
			// 9. if the guess is low 
				// 10. Tell them it's too low
			if(poo < random) {
				JOptionPane.showMessageDialog(null, "too low, u lose. answer = " + random);
			}
		// 13. Tell them they lose
		
	}

}

