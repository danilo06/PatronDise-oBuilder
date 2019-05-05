package ingsw.pdd.State;

import javax.swing.JFrame;
import ingsw.pdd.State.gui.ServerPanel;

public class StateMain {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("State pattern");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new ServerPanel());
		frame.pack();
		frame.setVisible(true);
	}
}