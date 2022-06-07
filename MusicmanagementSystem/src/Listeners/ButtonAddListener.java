package Listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.MusicAdder;
import gui.MusicViewer;
import gui.WindowFrame;

public class ButtonAddListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonAddListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
	    MusicAdder adder = frame.getMusicadder(); // JFrame을 상속받은 MusicAdder가 여기 오게 됨.
	    frame.setupPanel(adder);
	}

}
