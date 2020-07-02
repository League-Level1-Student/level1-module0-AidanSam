package _07_fortune_cookie;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Fortune implements ActionListener {

	public static void main(String[] args) {
		
		
		
	}
	 public void showButton() {
         System.out.println("Button clicked");
         JFrame frame = new JFrame();
         frame.setVisible(true);
         JButton button = new JButton();
         frame.add(button);
         frame.pack();
         button.addActionListener(this);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo!");
		Random rand = new Random();
		rand.nextInt(5);
		JOptionPane.showMessageDialog(null, "You will do stuff");
		
	}
 }

