package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Manager.MusicManager;

public class WindowFrame extends JFrame { //JFrame을 extends하는 WindowFrame클래스를 만들어 프레임의 기본값들을 정의해줌.
	
	MusicManager musicManager; // MusicManager의 내용이 넘어와야지만 사용자가 볼 수 있음.
	
	MenuSelection menuselection ;
	MusicAdder musicadder ;
    MusicViewer musicviewer ; 
    
	
	public WindowFrame(MusicManager musicManager) {
		this.setSize(500, 300); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.musicManager = musicManager; // this가 없으면 파라미터랑 헷갈릴 수 있음. musicManager를 추가해줌.
		menuselection = new MenuSelection(this);
		musicadder = new MusicAdder(this);
	    musicviewer = new MusicViewer(this, this.musicManager);
	    
		
		
		this.add(menuselection); 
		
		this.setVisible(true); 
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll(); //생각안한 GUI부분을 삭제해줌
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
		
	}
	
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public MusicAdder getMusicadder() {
		return musicadder;
	}

	public void setMusicadder(MusicAdder musicadder) {
		this.musicadder = musicadder;
	}

	public MusicViewer getMusicviewer() {
		return musicviewer;
	}

	public void setMusicviewer(MusicViewer musicviewer) {
		this.musicviewer = musicviewer;
	}

	

}
