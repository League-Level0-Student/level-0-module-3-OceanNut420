//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package _99_extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String mom = JOptionPane.showInputDialog("do u like banana?");
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		if(mom .equals("no")) {
			JOptionPane.showMessageDialog(null, "you are fat crazy");
		}
		//3. if they say yes
		//	ask them what is their favorite hobby
		if(mom .equals("yes")) {
			String dad = JOptionPane.showInputDialog("what is ur favorite hobby?");
			JOptionPane.showMessageDialog(null, dad + " is better with bananas?");
		}
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than “yes�? or “no�?
		//	show a pop up that says “You are bananas!�?
			}

}
