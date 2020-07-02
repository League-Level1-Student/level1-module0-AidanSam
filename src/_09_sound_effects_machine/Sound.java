package _09_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Sound implements ActionListener {

	public void showButton() {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	frame.setVisible(true);
	frame.add(panel);
	frame.pack();
	frame.setSize(500, 500);
	panel.setSize(400, 400);
	panel.setVisible(true);
	frame.pack();
	JButton dutton = new JButton();
	JButton button = new JButton();
	panel.add(dutton);
    panel.add(button);
    frame.pack();
    button.addActionListener(this);
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
