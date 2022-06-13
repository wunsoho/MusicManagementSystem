package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import Listeners.MusicAdderCancelListener;
import Listeners.MusicAdderListener;
import Manager.MusicManager;

public class MusicAdder extends JPanel { // �� �ܰ� ���� JPanel�� extends�ϵ��� ��.
	
	WindowFrame frame;
	
	MusicManager musicManager;
	
	public MusicAdder(WindowFrame frame, MusicManager musicManager) {
		this.frame = frame;
		this.musicManager = musicManager;
		 
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labeltitle = new JLabel("title: ", JLabel.TRAILING); 
		JTextField fieldtitle = new JTextField(10); 
		labeltitle.setLabelFor(fieldtitle);  
		panel.add(labeltitle); 
		panel.add(fieldtitle); 
		
		JLabel labeltime = new JLabel("time: ", JLabel.TRAILING); 
		JTextField fieldtime = new JTextField(10); 
		labeltime.setLabelFor(fieldtime);  
		panel.add(labeltime); 
		panel.add(fieldtime); 
		
		JLabel labelwriter = new JLabel("writer: ", JLabel.TRAILING); 
		JTextField fieldwriter = new JTextField(10); 
		labelwriter.setLabelFor(fieldwriter); 
		
		JButton saveButton =  new JButton("save");
		saveButton.addActionListener(new MusicAdderListener(fieldtitle, fieldtime, fieldwriter, musicManager)); 
		// saveButton�� MusicAdderListener�� �־��� . 
		 	
		JButton cancleButton =  new JButton("cancle");
		cancleButton.addActionListener(new MusicAdderCancelListener(frame));
		
		panel.add(labelwriter); 
		panel.add(fieldwriter); 
		
		panel.add(saveButton); 
		panel.add(cancleButton); 
		
		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6); 
		

		this.add(panel);
		this.setVisible(true);
		
	}

}
