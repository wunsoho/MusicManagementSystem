package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import Manager.MusicManager;
import Music.MusicInput;

public class MusicViewer extends JPanel { // 한 단계 낮춰 JPanel을 extends하도록 함.
	
	WindowFrame frame;
	
	MusicManager musicManager; // MusicViewer에 MusicManager 정보가 추가되어져야 함.
	
	public MusicViewer(WindowFrame frame, MusicManager musicManager) {
		this.frame = frame;
		this.musicManager = musicManager;
		
		System.out.println("***" + musicManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("title");
		model.addColumn("time");
		model.addColumn("writer");
		
		for (int i=0; i< musicManager.size(); i++) {
			Vector row = new Vector();
			MusicInput mi= musicManager.get(i);
			row.add(mi.getMusictitle());
			row.add(mi.getSongwriter());
			row.add(mi.getMusictime()); // row에다가 각각의 셀을 추가해줌.
			model.addRow(row); // model에 row를 추가시킴.
		} // musicManager의 사이즈보다	 작을 때까지 row를 추가시켜주는 작업
		
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
	}

}
