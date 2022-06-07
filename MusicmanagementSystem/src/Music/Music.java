package Music;

import java.io.Serializable;
import java.util.Scanner;

import exception.TitleFormatException;

public abstract class Music implements MusicInput, Serializable{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = 6907939553720967110L; // seialVersionId를 추가해줌
	
	//MusicInput에 함수들을 다 넣어놔 각자 implements하지 않고 Music만 하면 됨		
	protected MusicKind kind = MusicKind.Ballad;
	protected String musictitle;
	protected String songwriter;
	protected String musictime; //필드 생성자 선언
	
	public Music() {
	} // 파라미터 0개
	
	public Music(MusicKind kind) {
		this.kind = kind;
	} // 파라미터 1개
	
	public Music(String musictitle, String songwriter) {
		this.musictitle = musictitle;
		this.songwriter = songwriter;
	} // 파라미터 2개
	
	public Music(MusicKind kind, String musictitle, String songwriter, String musictime) {
		this.kind = kind; // kind값도 받게 함
		this.musictitle = musictitle;
		this.songwriter = songwriter;
		this.musictime = musictime;
	} // 파라미터 3개
	
	public MusicKind getkind() {
		return kind;
	}
	
	public void setKind(MusicKind kind) {
		this.kind = kind;
	}
	
	public String getMusictitle() {
		return musictitle;
	}
	
	public void setMusictitle(String musictitle){
		this.musictitle = musictitle;
	}
	
	public String getSongwriter() {
		return songwriter;
	}
	
	public void setSongwriter(String songwriter) throws TitleFormatException{
		if (songwriter.contains("@") || songwriter.equals("")) {
			throw new TitleFormatException();
			
		} //musictitle이 @를 무조건 포함하게 함
		
		this.songwriter = songwriter;
	}
	
	public String getMusictime() {
		return musictime;
	}
	
	public void setMusictime(String musictime) {
		this.musictime = musictime;
	}	
		
	public abstract void printInfo(); 
	
	public void setMusictitle(Scanner a) {// this로 처리가 가능하기 때문에 MusicInput을 다 지워줌
		System.out.println("musictitle :");
		String musictitle = a.next();
		this.setMusictitle(musictitle);
	} 
	
	public void setSongwriter(Scanner a) { // this로 처리가 가능하기 때문에 MusicInput을 다 지워줌
		String songwriter = "";
		while (!songwriter.contains("@")) { // 골뱅이가 포함되어 있지 않다면 try, catch가 돌아감
			System.out.println("songwriter :");
			songwriter = a.next();
			try {
				this.setSongwriter(songwriter); // this로 바꿔줌	
			} catch (TitleFormatException e) {
				System.out.println("Incorrect writer Format. put the writer that contains @");
			}
		}
	}
	
	public void setMusictime(Scanner a) { // this로 처리가 가능하기 때문에 MusicInput을 다 지워줌
		System.out.println("musictime :");
		String musictime = a.next();
		this.setMusictime(musictime);
	} 
	
	public String getKindString() { //오버리딩 되므로 문자열을 불러오도록 String을 한 번 더 씀
		String skind = "none"; 
		switch(this.kind) { 
		case Hiphop:
			skind = "Hip.";
			break;
		case Ballad:
			skind = "bal.";
			break;
		case trot:
			skind = "tr.";
			break;
		case rap:
			skind = "r.";
			break;
		default:
		}
		return skind;
	}
	
	
	
	
 
}
