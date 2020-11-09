package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public void run() {
		
		Robot houserobot = new Robot();
		houserobot.setSpeed(10);
		houserobot.setX(-10);
		houserobot.setY(500);
		houserobot.penDown();
		houserobot.turn(90);
		houserobot.move(50);
		houserobot.turn(-90);
		for(int i = 0;i<3; i++) {
		houserobot.move(75);
		houserobot.turn(90);
		houserobot.turn(270);
		houserobot.turn(90);
		}
		
		
		
		
		}
		
}
