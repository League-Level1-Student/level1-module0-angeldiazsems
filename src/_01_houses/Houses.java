package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public void run() {

		Random ran = new Random();
		
		houserobot.penDown();
		houserobot.setSpeed(75);
		houserobot.setX(-10);
		houserobot.setY(500);
		houserobot.turn(90);
		houserobot.move(25);
		houserobot.turn(-90);
		for (int i = 0; i < 10; i++) {
			int color = ran.nextInt(5);
			
			if(color%5==0) {
				houserobot.setPenColor(Color.BLUE);
			}
			else if(color%5==1) {
				houserobot.setPenColor(Color.RED);
			}
			else if(color%5==2) {
				houserobot.setPenColor(Color.GREEN);
			}
			else if(color%5==3) {
				houserobot.setPenColor(Color.PINK);
			}
			else if(color%5==4) {
				houserobot.setPenColor(Color.CYAN);
			}
			
			
			
			int height = ran.nextInt(3);
if(height%3==0) {
	houseDrawer("small");
}
else if(height%3==1) {
	houseDrawer("medium");
}
else if(height%3==2)	{
	houseDrawer("large");
}

		}
	}

	Robot houserobot = new Robot();

	void houseDrawer(String height) {
		int hi = 123;
		
	if(height.equals("small")) {
			hi = 60;
		}
	
	else if(height.equals("medium")) {
		hi = 120;
	}
		
	else if(height.equals("large")){
		hi=240;
	}
		
		// starts facing up
		houserobot.move(hi);
		houserobot.turn(90);
		houserobot.move(50);
		houserobot.turn(90);
		houserobot.move(hi);
		houserobot.turn(-90);
		houserobot.move(35);
		houserobot.turn(-90);

	}

}
