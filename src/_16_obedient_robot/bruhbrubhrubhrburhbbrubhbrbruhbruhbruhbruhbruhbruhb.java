package _16_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class bruhbrubhrubhrburhbbrubhbrbruhbruhbruhbruhbruhbruhb {

	public static void main(String[] args) {
	String mom = JOptionPane.showInputDialog("circle, triangle, or square?");
	
	if(mom .equals("circle")) {
		drawCircle();
	}
	if(mom .equals("square")) {
		drawSquare();
	}
	if(mom .equals("triangle")) {
		drawTriangle();
	}
				
		
		

	}
		
	
static void drawSquare() {
	Robot mom = new Robot();
	String dad = JOptionPane.showInputDialog("give color");
	if(dad .equals("red")) {
	mom.setPenColor(200,0,0);
	}
	if(dad .equals("orange")) {
		mom.setPenColor(255,133,18);
		}
	if(dad .equals("yellow")) {
		mom.setPenColor(255,244,23);
		}
	if(dad .equals("green")) {
		mom.setPenColor(23,255,48);
		}
	if(dad .equals("blue")) {
		mom.setPenColor(21,2,242);
		}
	if(dad .equals("purple")) {
		mom.setPenColor(111,2,191);
		}

	mom.setSpeed(1000);
	mom.penDown();
	for(int i = 0; i<4; i++) {
		mom.move(100);	
		mom.turn(90);
	}
	
	
}
static void drawTriangle() {
	Robot mom = new Robot();
	String dad = JOptionPane.showInputDialog("give color");
	if(dad .equals("red")) {
	mom.setPenColor(200,0,0);
	}
	if(dad .equals("orange")) {
		mom.setPenColor(255,133,18);
		}
	if(dad .equals("yellow")) {
		mom.setPenColor(255,244,23);
		}
	if(dad .equals("green")) {
		mom.setPenColor(23,255,48);
		}
	if(dad .equals("blue")) {
		mom.setPenColor(21,2,242);
		}
	if(dad .equals("purple")) {
		mom.setPenColor(111,2,191);
		}

	mom.setSpeed(1000);
	mom.penDown();
	for(int i = 0; i<3; i++) {
		mom.move(100);	
		mom.turn(120);

	
}
}
static void drawCircle() {
	Robot mom = new Robot();
	String dad = JOptionPane.showInputDialog("give color");
	if(dad .equals("red")) {
	mom.setPenColor(200,0,0);
	}
	if(dad .equals("orange")) {
		mom.setPenColor(255,133,18);
		}
	if(dad .equals("yellow")) {
		mom.setPenColor(255,244,23);
		}
	if(dad .equals("green")) {
		mom.setPenColor(23,255,48);
		}
	if(dad .equals("blue")) {
		mom.setPenColor(21,2,242);
		}
	if(dad .equals("purple")) {
		mom.setPenColor(111,2,191);
		}

	mom.setSpeed(1000);
	mom.penDown();
	for(int i = 0; i<360; i++) {
		mom.move(1);	
		mom.turn(1);

}
}
}