package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public void run() {
		int height = 123;
		
		//int ran = new Random;
	
		houseDrawer(height);
		
		
		}

	Robot houserobot = new Robot();
	
	void houseDrawer(int height) {
	
		houserobot.penDown();
		houserobot.setSpeed(10);
		houserobot.setX(-10);
		houserobot.setY(500);
		houserobot.turn(90);
		houserobot.move(25);
		houserobot.turn(-90);
	for(int i = 0; i<10;i++) {
			houserobot.move(100);
			houserobot.turn(90);
			houserobot.move(50);
			houserobot.turn(90);
			houserobot.move(100);
			houserobot.turn(-90);
			houserobot.move(35);
			houserobot.turn(-90);
	}
	
	}
			
	}
	
	

