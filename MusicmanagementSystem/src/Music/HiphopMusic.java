package Music;

import java.util.Scanner;

import exception.TitleFormatException;

public class HiphopMusic extends RnBMusic { // Student���� implements�����Ƿ� ������
	
	protected String samesongwriter; //���� �۰�
	protected String samemusictime; //���� �ð�
	
	public HiphopMusic(MusicKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner a) {
		setMusictitle(a);	
		setSongwriter(a);
		setSongwriterwithYN(a);
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("do you have a same writer (Y/N");
			answer = a.next().charAt(0);
			try {
				if(answer == 'y' || answer == 'Y') {
					setSongwriter(a); //this�� �̿��Ͽ� �ڵ带 ����ȭ ��
					break;
				}
				else if (answer == 'n' || answer == 'N') {
					this.setSongwriter("");
					break;
				}
				else {	
				}
			}	
			catch (TitleFormatException e) {
				System.out.println("Incorrect writer Format. put the writer that contains @");
			}
		} 
		
		setMusictime(a); //this�� �̿��Ͽ� ����ȭ ��
		}
	
	public void printInfo() {
		String skind = getKindString();	
		System.out.println("kind:" + skind + " title:" + musictitle + "same writer:" +  songwriter + "same time:" + musictime);
	}   //���� �۰��� �ð��� �����

	
}

