package Music;

import java.util.Scanner;

public class trotMusic extends Music { // Student에서 implements했으므로 지워줌
	
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
