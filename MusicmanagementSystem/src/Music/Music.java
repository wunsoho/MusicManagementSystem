package Music;

import java.io.Serializable;
import java.util.Scanner;

import exception.TitleFormatException;

public abstract class Music implements MusicInput, Serializable{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = 6907939553720967110L; // seialVersionId�� �߰�����
	
	//MusicInput�� �Լ����� �� �־�� ���� implements���� �ʰ� Music�� �ϸ� ��		
	protected MusicKind kind = MusicKind.Ballad;
	protected String musictitle;
	protected String songwriter;
	protected String musictime; //�ʵ� ������ ����
	
	public Music() {
	} // �Ķ���� 0��
	
	public Music(MusicKind kind) {
		this.kind = kind;
	} // �Ķ���� 1��
	
	public Music(String musictitle, String songwriter) {
		this.musictitle = musictitle;
		this.songwriter = songwriter;
	} // �Ķ���� 2��
	
	public Music(MusicKind kind, String musictitle, String songwriter, String musictime) {
		this.kind = kind; // kind���� �ް� ��
		this.musictitle = musictitle;
		this.songwriter = songwriter;
		this.musictime = musictime;
	} // �Ķ���� 3��
	
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
			
		} //musictitle�� @�� ������ �����ϰ� ��
		
		this.songwriter = songwriter;
	}
	
	public String getMusictime() {
		return musictime;
	}
	
	public void setMusictime(String musictime) {
		this.musictime = musictime;
	}	
		
	public abstract void printInfo(); 
	
	public void setMusictitle(Scanner a) {// this�� ó���� �����ϱ� ������ MusicInput�� �� ������
		System.out.println("musictitle :");
		String musictitle = a.next();
		this.setMusictitle(musictitle);
	} 
	
	public void setSongwriter(Scanner a) { // this�� ó���� �����ϱ� ������ MusicInput�� �� ������
		String songwriter = "";
		while (!songwriter.contains("@")) { // ����̰� ���ԵǾ� ���� �ʴٸ� try, catch�� ���ư�
			System.out.println("songwriter :");
			songwriter = a.next();
			try {
				this.setSongwriter(songwriter); // this�� �ٲ���	
			} catch (TitleFormatException e) {
				System.out.println("Incorrect writer Format. put the writer that contains @");
			}
		}
	}
	
	public void setMusictime(Scanner a) { // this�� ó���� �����ϱ� ������ MusicInput�� �� ������
		System.out.println("musictime :");
		String musictime = a.next();
		this.setMusictime(musictime);
	} 
	
	public String getKindString() { //�������� �ǹǷ� ���ڿ��� �ҷ������� String�� �� �� �� ��
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
