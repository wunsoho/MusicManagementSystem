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
		
		JLabel labeltitle = new JLabel("title: ", JLabel.TRAILING); //������ �Է��϶�� label�� ����.
		JTextField fieldtitle = new JTextField(10); // �Է��� �� �ִ� TextField�� ����.
		labeltitle.setLabelFor(fieldtitle); // TextField�� ���� label�̶�� ��������. 
		panel.add(labeltitle); // panel�� labeltitle�� �߰�����.
		panel.add(fieldtitle); // panel�� fieldtitle�� �߰�����.
		
		JLabel labeltime = new JLabel("time: ", JLabel.TRAILING); //��Ÿ���� �Է��϶�� label�� ����.
		JTextField fieldtime = new JTextField(10); 
		labeltime.setLabelFor(fieldtime);  
		panel.add(labeltime); // labeltime�� �߰�����.
		panel.add(fieldtime); // fieldtime�� �߰�����.
		
		JLabel labelwriter = new JLabel("writer: ", JLabel.TRAILING); //��Ÿ���� �Է��϶�� label�� ����.
		JTextField fieldwriter = new JTextField(10); 
		labelwriter.setLabelFor(fieldwriter); // . 
		panel.add(labelwriter); // labelwriter�� �߰�����.
		panel.add(fieldwriter); // fieldwriter�� �߰�����.
		
		panel.add(new JButton("save")); 
		panel.add(new JButton("cancel")); // ��ư �� ���� �������.
		
		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6); // ���� �� ����.
		
		this.setSize(300, 300); // 300,300 ������� ������.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x��ư�� ������ ���α׷��� �����.
		this.setContentPane(panel);
		this.setVisible(true);
		
	}

}
