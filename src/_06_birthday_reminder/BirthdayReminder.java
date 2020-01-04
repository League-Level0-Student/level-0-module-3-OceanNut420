
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "June";
		String dadsBirthday = "January";
		String myBirthday = "April";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String cousin = JOptionPane.showInputDialog("enter person (doovin, doovin mom, doovin dad)");
		// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
			//print mom's birthday
		if(cousin .equals("doovin mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		if(cousin .equals("doovin dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}

		// 6. if user asked for your name
			// print myBirthday
		if(cousin .equals("doovin")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		}

		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null, "who dat");
		}
	} 
}
