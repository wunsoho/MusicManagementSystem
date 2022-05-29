package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class MusicAdder extends JFrame{
	
	public MusicAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labeltitle = new JLabel("title: ", JLabel.TRAILING); //제목을 입력하라는 label을 만듬.
		JTextField fieldtitle = new JTextField(10); // 입력할 수 있는 TextField를 만듬.
		labeltitle.setLabelFor(fieldtitle); // TextField를 위한 label이라고 설정해줌. 
		panel.add(labeltitle); // panel에 labeltitle을 추가해줌.
		panel.add(fieldtitle); // panel에 fieldtitle을 추가해줌.
		
		JLabel labeltime = new JLabel("time: ", JLabel.TRAILING); //런타임을 입력하라는 label을 만듬.
		JTextField fieldtime = new JTextField(10); 
		labeltime.setLabelFor(fieldtime);  
		panel.add(labeltime); // labeltime을 추가해줌.
		panel.add(fieldtime); // fieldtime을 추가해줌.
		
		JLabel labelwriter = new JLabel("writer: ", JLabel.TRAILING); //런타임을 입력하라는 label을 만듬.
		JTextField fieldwriter = new JTextField(10); 
		labelwriter.setLabelFor(fieldwriter); // . 
		panel.add(labelwriter); // labelwriter을 추가해줌.
		panel.add(fieldwriter); // fieldwriter을 추가해줌.
		
		panel.add(new JButton("save")); 
		panel.add(new JButton("cancel")); // 버튼 두 개를 만들어줌.
		
		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6); // 열이 네 개임.
		
		this.setSize(300, 300); // 300,300 사이즈로 설정함.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼을 누르면 프로그램이 종료됨.
		this.setContentPane(panel);
		this.setVisible(true);
		
	}

}
