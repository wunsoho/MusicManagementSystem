package Music;

import java.util.Scanner;

public class BalladMusic extends RnBMusic { // Student에서 implements했으므로 지워줌
	
	
	public BalladMusic(MusicKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner a) {
		setMusictitle(a);	
		setSongwriter(a);
		setSongwriterwithYN(a);
		setMusictime(a); //this를 이용하여 간단화 함
	}
}

