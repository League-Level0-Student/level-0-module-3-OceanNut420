//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _99_extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot robot = new Robot();
	public static void main(String[] args) {
		
		 // 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.
String mom = JOptionPane.showInputDialog("how dizzy u want robot 1-10?");
 int dad = Integer.parseInt(mom);
// 1. Use the dance method to make the robot spin.
	dance(dad);

	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			robot.setSpeed(10);
			robot.turn(360);
		}
	}
}

