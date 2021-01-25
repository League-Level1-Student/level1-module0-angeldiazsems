package _08_jack_in_the_box;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class suprisekid implements ActionListener { 

	JFrame frame = new JFrame();
	JButton button = new JButton("Click for Candy");
    JPanel panel = new JPanel();
    int numberpressed = 0;

    
  void run() {
	frame.setVisible(true);
	 panel.add(button);
	 frame.add(panel);
	 frame.pack();
	 button.addActionListener(this);
	 
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	numberpressed++;
	if(numberpressed == 5) {
		
		private void showPicture(String jackInTheBox.png) { 
		     try {
		          JLabel imageLabel = createLabelImage(jackInTheBox.png);
		          JFrame frame = new JFrame();
		          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		          frame.add(imageLabel);
		          frame.setVisible(true);
		          frame.pack();
		     } catch (Exception e) {
		          e.printStackTrace();
		     }
		}

		private JLabel createLabelImage(String jackInTheBox.png) {
		     try {
		          URL imageURL = getClass().getResource(jackInTheBox.png);
		          if (imageURL == null) {
		               System.err.println("Could not find image " + jackInTheBox.png);
		               return new JLabel();
		          } else {
		               Icon icon = new ImageIcon(imageURL);
		               JLabel imageLabel = new JLabel(icon);
		               return imageLabel;
		          }
		     } catch (Exception e) {
		          System.err.println("Could not find image " + jackInTheBox.png);
		          return new JLabel();
		     }
		}
		
		
	}
	
}
}

