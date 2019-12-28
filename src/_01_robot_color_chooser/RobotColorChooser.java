//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot e = new Robot();
		//3. Ask the user what color they would like the robot to draw
		for(int z=0; z<300; z++) {
		String eee = JOptionPane.showInputDialog("give color now(red, orange, yellow, green, blue, purple)");
		//5. Use an if/else statement to set the pen color that the user requested
		Random random = new Random();
		int one = random.nextInt(255);
		int two = random.nextInt(255);
		int three = random.nextInt(255);
		if(eee .equals("red")) {
			e.setPenColor(200,0,0);
		}
		if(eee .equals("orange")) {
			e.setPenColor(200,100,0);
		}
		if(eee .equals("yellow")) {
			e.setPenColor(246,255,8);
		}

		if(eee .equals("green")) {
			e.setPenColor(100,200,0);
		}
		if(eee .equals("blue")) {
			e.setPenColor(0,0,200);
		}
		if(eee .equals("purple")) {
			e.setPenColor(151,10,240);
		}

		else{
			e.setPenColor(one,two,three);
		}
        //6. If the user doesn’t enter anything, choose a random color
//ok
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		e.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		e.penDown();
		e.setSpeed(200);
		for(int i=0; i<360; i++) {
			e.move(2);
			e.turn(1);
		}
		}
	}

	}
