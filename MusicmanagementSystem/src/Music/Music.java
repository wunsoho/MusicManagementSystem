package Music;

import java.util.Scanner;

public class Music {
	
	public Music() {
	}
	
	public Music(String musictitle, String songwriter) {
		this.musictitle = musictitle;
		this.songwriter = songwriter;
	}
	
	public Music(String musictitle, String songwriter, String musictime) {
		this.musictitle = musictitle;
		this.songwriter = songwriter;
		this.musictime = musictime;
	}
	
	public MusicKind getkind() {
		return kind;
	}
	
	public void setKind(MusicKind kind) {
		this.kind = kind;
	}
	
	public String getMusictitle() {
		return musictitle;
	}
	
	public void setMusictitle(String musictitle) {
		this.musictitle = musictitle;
	}
	
	public String getSongwtiter() {
		return songwriter;
	}
	
	public void setSongwriter(String songwriter) {
		this.songwriter = songwriter;
	}
	
	public String getMusictime() {
		return musictime;
	}
	
	public void setMusictime(String musictime) {
		this.musictime = musictime;
	}
	
	protected MusicKind kind = MusicKind.Ballad;
	String musictitle;
	String songwriter;
	String musictime;
	
	public void printInfo() {
		System.out.println("title:" + musictitle + "writer:" +  songwriter + "time:" + musictime);
	}
	
	public void getUserInput(Scanner a) {
		System.out.println("musictitle");
		String musictitle = a.next();
		this.setMusictitle(musictitle);
		System.out.println("songwriter");
		String songwriter= a.next();
		this.setSongwriter(songwriter);
		System.out.println("musictime");
		String musictime = a.next();
		this.setMusictime(musictime);
	}
	
	
	
	
 
}
