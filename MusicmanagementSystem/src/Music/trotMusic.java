package Music;

import java.util.Scanner;

public class trotMusic extends Music { // Student���� implements�����Ƿ� ������
	
	public trotMusic(MusicKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner a) {
		setMusictitle(a);	
		setSongwriter(a);
		setMusictime(a);
	}
		
	public void printInfo() {
		String skind = getKindString();	
		System.out.println("kind:" + skind + " title:" + musictitle + "writer:" +  songwriter + "time:" + musictime);
	}
}
