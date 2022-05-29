package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame; //BorderLayout�� FlowLayout���� �ٲ���.
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection extends JFrame { //GUI�� ����� ���� JFrame�� extends��.
	
	public MenuSelection() {
		this.setSize(300, 300); // �������� ũ�⸦ 300,300���� ������.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x��ư�� ������ â�� ������ ��.
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel(); // �� ���� panel�� ����.
		JLabel label = new JLabel("Menu Selection"); // label�� �ϳ� ����.
		
		JButton button1 = new JButton("Add music");
		JButton button2 = new JButton("View music");
		JButton button3 = new JButton("Edit music");
		JButton button4 = new JButton("Delete music");
		JButton button5 = new JButton("Exit Program"); // ��ư 5���� �������.
		
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5); // panel�� ��ư 5���� �߰���.
		
        this.add(panel1, BorderLayout.NORTH); //BorderLayout�� �̿��� panel1�� ��ġ�� NORTH�� ������.
        this.add(panel2, BorderLayout.CENTER); //BorderLayout�� �̿��� panel2�� ��ġ�� CENTER�� ������.
        
		this.setVisible(true); //�������� ���� �� �ֵ��� ��.
	}

}
