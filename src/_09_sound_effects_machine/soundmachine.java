package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class soundmachine implements ActionListener {
	int buttonpressed = 0;
	JButton button = new JButton("water-click");
    JButton button2 = new JButton("sawing-wood");
    JButton button3 = new JButton("walking-in-long-grass");
    JButton button4 = new JButton("piano-melody");
	public void showButton() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        
        
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        frame.add(panel);
        frame.pack();
        button.addActionListener(this);
        
        
}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
if(button == arg0.getSource()) {
	playSound("371274__mafon2__water-click.wav");
}
if(button2 == arg0.getSource()) {
	playSound("sawing-wood-daniel_simon.wav");
}
if(button3 == arg0.getSource()) {
	playSound("155589__leafs67__walking-in-long-grass.wav");
}
if(button4 == arg0.getSource()) {
	playSound("186942__lemoncreme__piano-melody.wav");
}	
	}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}
	
	
}
	
