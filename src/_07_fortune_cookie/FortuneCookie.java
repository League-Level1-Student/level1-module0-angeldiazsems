package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener {
        public void showButton() {
            JFrame frame = new JFrame();
            frame.setVisible(true);
            JButton button = new JButton("button boi");
            JPanel panel = new JPanel();
            panel.add(button);
            frame.add(panel);
            frame.pack();
            button.addActionListener(this);
            
            
	}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			int rand = new Random().nextInt(5);
            if(rand == 0) {
            	JOptionPane.showMessageDialog(null, "You will become rich");
            }
            if(rand == 1) {
            	JOptionPane.showMessageDialog(null, "Your greatest dream will come true");
            }
            if(rand ==2) {
            	JOptionPane.showMessageDialog(null, "You will find a penny on the ground");
            }
            if(rand ==3) {
            	JOptionPane.showMessageDialog(null, "You will trip within an hour");
            }
            if(rand ==4) {
            	JOptionPane.showMessageDialog(null, "You will find a treasure at the beach");
            }
		}
        

}
