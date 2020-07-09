package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cute implements ActionListener {

	public static void main(String[] args) {
		
	
	
	
}
	 public void showButton() {
         
         JFrame frame = new JFrame();
         JPanel panel = new JPanel();
         frame.setVisible(true);
         panel.setVisible(true);
        frame.add(panel);
        frame.pack();
         JButton button = new JButton();
         JButton dutton = new JButton();
         panel.add(dutton);
         panel.add(button);
        
    
         button.setText("Ducks");
         dutton.setText("Fluffy Unicorns");
  
         frame.pack();
         button.addActionListener(this);
	 dutton.addActionListener(this);
	
}
	 void showDucks() {
	      System.out.println("video");
	 }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		showDucks();
	}

}
