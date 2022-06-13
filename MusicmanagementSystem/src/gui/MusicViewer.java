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

public class MusicViewer extends JPanel {
	
	WindowFrame frame;
	
	MusicManager musicManager; 
	
	public MusicManager getMusicManager() {
		return musicManager;
	}

	public void setMusicManager(MusicManager musicManager) {
		this.musicManager = musicManager;
		this.removeAll();
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("title");
		model.addColumn("time");
		model.addColumn("writer");
		
		for (int i=0; i< musicManager.size(); i++) {
			Vector row = new Vector();
			MusicInput mi= musicManager.get(i);
			row.add(mi.getMusictitle());
			row.add(mi.getSongwriter());
			row.add(mi.getMusictime()); 
			model.addRow(row); 
		}
		
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

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
			row.add(mi.getMusictime()); 
			model.addRow(row); 
		}
		
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}
