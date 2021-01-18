package _08_jack_in_the_box;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class suprisekid { 
public static void main(String[] args) {

	JFrame frame = new JFrame();
	frame.setVisible(true);
	JButton button = new JButton("Click for Candy");
    JPanel panel = new JPanel();
    panel.add(button);
    frame.add(panel);
    frame.pack();

}

}
