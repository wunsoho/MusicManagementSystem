package Music;

import java.util.Scanner;

public class BalladMusic extends RnBMusic { // Student���� implements�����Ƿ� ������
	
	
	public BalladMusic(MusicKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner a) {
		setMusictitle(a);	
		setSongwriter(a);
		setSongwriterwithYN(a);
		setMusictime(a); //this�� �̿��Ͽ� ����ȭ ��
	}
}

