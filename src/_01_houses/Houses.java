package _01_houses;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
		
	Robot rob = new Robot();
	public static void main(String[] args) {
		
	}
	public void run() {
		
		rob.setSpeed(500);
		rob.turn(90);
		rob.move(330);
		rob.turn(90);
		rob.move(200);
		rob.turn(180);
		rob.penDown();
		rob.move(200);
		rob.turn(270);
		rob.move(40);
		rob.turn(270);
		rob.move(200);
		rob.turn(90);
		rob.move(50);
		for(int i = 0; i < 10; i++) {
		String height = JOptionPane.showInputDialog("Tall, Medium or Low?");
		if(height.equalsIgnoreCase("tall")) {
			rob.turn(90);
			rob.move(2000);
			rob.turn(270);
			rob.move(40);
			rob.turn(270);
			rob.move(2000);
			rob.turn(90);
			rob.move(50);
		}else if(height.equalsIgnoreCase("medium")){
rob.turn(90);
rob.move(300);
rob.turn(270);
rob.move(40);
rob.turn(270);
rob.move(300);
rob.turn(90);
rob.move(50);

		}else if(height.equalsIgnoreCase("low")){
			rob.turn(90);
			rob.move(150);
			rob.turn(270);
			rob.move(40);
			rob.turn(270);
			rob.move(150);
			rob.turn(90);
			rob.move(50);
		}
		}
		}
}
