package Listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Manager.MusicManager;
import Music.BalladMusic;
import Music.Music;
import Music.MusicInput;
import Music.MusicKind;
import exception.TitleFormatException;

public class MusicAdderListener implements ActionListener {
	JTextField fieldtitle;
	JTextField fieldtime;
	JTextField fieldwriter;
	
	MusicManager musicManager;
	
	public MusicAdderListener(
			JTextField fieldtitle, 
			JTextField fieldtime, 
			JTextField fieldwriter, MusicManager musicManager) {
		super();
		this.fieldtitle = fieldtitle;
		this.fieldtime = fieldtime;
		this.fieldwriter = fieldwriter;
		this.musicManager = musicManager;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {		
		MusicInput music = new BalladMusic(MusicKind.Ballad);
		try {
			music.setMusictitle(fieldtitle.getText());
			music.setMusictime(fieldtime.getText());
			music.setSongwriter(fieldwriter.getText());
			musicManager.addMusic(music);
			putObject(musicManager, "musicmanager.ser");
			music.printInfo();
		} catch (TitleFormatException e1) {
			e1.printStackTrace();
		}
		
	}
	
	public static void putObject(MusicManager musicManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(musicManager); //저장 된 후 파일네임으로 출력
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
