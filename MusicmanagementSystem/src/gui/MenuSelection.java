package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame; //BorderLayout을 FlowLayout으로 바꿔줌.
import javax.swing.JLabel;
import javax.swing.JPanel;

import Listeners.ButtonAddListener;
import Listeners.ButtonViewListener;

public class MenuSelection extends JPanel { 
	
	WindowFrame frame; // menuselection클래스가 WindowFrame을 가지고 있게 함. 
	
	public MenuSelection(WindowFrame frame) {
		this.frame = frame;
		
		this.setLayout(new BorderLayout()); // 원래 FlowLayout인 JPanel을 BorderLayout으로 바꿔줌.
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel(); 
		JLabel label = new JLabel("Menu Selection"); 
		
		JButton button1 = new JButton("Add music");
		JButton button2 = new JButton("View music"); 
		JButton button3 = new JButton("Edit music");
		JButton button4 = new JButton("Delete music");
		JButton button5 = new JButton("Exit Program"); 
		
		button1.addActionListener(new ButtonAddListener(frame)); // add하기전에 ActionListener를 넣어 ButtonAddListener와 연결해줌.
		button2.addActionListener(new ButtonViewListener(frame)); //add하기전에 ActionListener를 넣어 ButtonViewListener와 연결해줌.
		
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5); 
		
        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.CENTER); 
        
		
	}

}
