package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame; //BorderLayout을 FlowLayout으로 바꿔줌.
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection extends JFrame { //GUI를 만들기 위해 JFrame을 extends함.
	
	public MenuSelection() {
		this.setSize(300, 300); // 프레임의 크기를 300,300으로 정의함.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼을 누르면 창이 닫히게 함.
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel(); // 두 개의 panel을 만듬.
		JLabel label = new JLabel("Menu Selection"); // label을 하나 만듬.
		
		JButton button1 = new JButton("Add music");
		JButton button2 = new JButton("View music");
		JButton button3 = new JButton("Edit music");
		JButton button4 = new JButton("Delete music");
		JButton button5 = new JButton("Exit Program"); // 버튼 5개를 만들어줌.
		
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5); // panel에 버튼 5개를 추가함.
		
        this.add(panel1, BorderLayout.NORTH); //BorderLayout을 이용해 panel1의 위치를 NORTH로 지정함.
        this.add(panel2, BorderLayout.CENTER); //BorderLayout을 이용해 panel2의 위치를 CENTER로 지정함.
        
		this.setVisible(true); //프레임이 보일 수 있도록 함.
	}

}
