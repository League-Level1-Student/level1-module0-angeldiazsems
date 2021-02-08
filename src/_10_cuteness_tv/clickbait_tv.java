package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class clickbait_tv implements ActionListener {
	JButton button = new JButton("ducks");
    JButton button2 = new JButton("frogs");
    JButton button3 = new JButton("unicorns");
   
	public void showButton() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        
        
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(button2);
        panel.add(button3);
        frame.add(panel);
        frame.pack();
        button.addActionListener(this);
}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(button == arg0.getSource()) {
			showDucks();
		}
		if(button2 == arg0.getSource()) {
			showFrog();
		}
		if(button3 == arg0.getSource()) {
			showFluffyUnicorns();
		}
		
		
		
		
	}
	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't 
	     //work on some Linux implementations 
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] { 
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID }); 
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	
	//videos don't work?
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=FXf2U2GZU7k&feature=emb_logo&ab_channel=Teacher%27sPet");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=AgpWX18dby4");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=G52dUQLxPzg");
	}

	
}
