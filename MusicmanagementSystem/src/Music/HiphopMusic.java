package Music;

import java.util.Scanner;

import exception.TitleFormatException;

public class HiphopMusic extends RnBMusic { // Student에서 implements했으므로 지워줌
	
	protected String samesongwriter; //같은 작가
	protected String samemusictime; //같은 시간
	
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
					setSongwriter(a); //this를 이용하여 코드를 간단화 함
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
		
		setMusictime(a); //this를 이용하여 간단화 함
		}
	
	public void printInfo() {
		String skind = getKindString();	
		System.out.println("kind:" + skind + " title:" + musictitle + "same writer:" +  songwriter + "same time:" + musictime);
	}   //같은 작가와 시간을 출력함

	
}

