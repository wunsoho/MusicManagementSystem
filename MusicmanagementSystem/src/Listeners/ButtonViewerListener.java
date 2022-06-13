package Listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import Manager.MusicManager;
import gui.MusicViewer;
import gui.WindowFrame;

public class ButtonViewerListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonViewerListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		MusicViewer musicViewer = frame.getMusicviewer();
		MusicManager musicManager = getObject("musicmanager.ser");
		musicViewer.setMusicManager(musicManager); 
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(musicViewer);
	    frame.revalidate();
	    frame.repaint();
	}
	
	public static MusicManager getObject(String filename) {
		MusicManager musicManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			musicManager = (MusicManager) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return musicManager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return musicManager; 
		
	}
 
}
